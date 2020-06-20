(ns app.views
  (:require [clojure.string :as s]
            [reagent.core :as r]
            [app.entities :refer [entities]]
            [app.table :refer [table]]))

(defonce app-state (r/atom {:entity "Property",
                            :person {:car true,
                                     :sex "Male",
                                     :terms true},
                            :property {:streetnumber "15",
                                       :streetname "Waterman Way",
                                       :city "London",
                                       :postcode "E1W2QN",
                                       :countries "United Kingdom"}
                            :company {:name "Recursive Labs",
                                      :tradingname "Recursive Labs LTD",
                                      :numberofemployees "2"}}
                           :offer {:offerprice "12000"}))

; (defonce app-state (r/atom {:entity nil}))

(defn set-current-entity
  [entity]
  (swap! app-state assoc :entity entity))

(defn current-entity
  []
  (:entity @app-state))

(defn name-to-key
  [names]
  (keyword (s/join "-" (for [name names]
                        (s/lower-case (s/replace name #" " ""))))))

(defn key-to-name
      [key]
      (s/capitalize (name key)))

(defn get-attr-from-entity
  [entity attr]
  ((name-to-key [attr]) ((name-to-key [entity]) @app-state)))

(defn text-input
  [entity name & input-type]
  (let [local-input-type (or input-type "text")]
    [:div.field
     [:label.label name]
     [:div.control.has-icons-left.has-icons-right
      [:input.input
       {:value       ((name-to-key [name]) ((name-to-key [entity]) @app-state))
        ; :on-change   #(swap! app-state assoc-in [:map :new-key] value)
        :on-change   #(swap!
                       app-state
                       assoc-in [(name-to-key [entity]) (name-to-key [name])]
                       (.. % -target -value))
        :placeholder name
        :type        local-input-type}]]]))

(defn select-box
  [entity name options]
  [:div.field
   [:label.label name]
   [:div.control
    [:div.select
     [:select {:on-change #(swap!
                            app-state
                            assoc-in [(name-to-key [entity]) (name-to-key [name])]
                            (.. % -target -value))}
      [:option {:value ""} "Select option"]
      (for [option options]
           [:option {:value option :key option} option])]]]])

(defn text-area
  [entity name]
  [:div.field
   [:label.label name]
   [:div.control
    [:textarea.textarea
     {:placeholder name
      :on-change #(swap!
                   app-state
                   assoc-in [(name-to-key [entity]) (name-to-key [name])]
                   (.. % -target -value))}
     ((name-to-key [name]) ((name-to-key [entity]) @app-state))]]])

(defn check-box
  [entity name options]
  [:div.field
   (for [o options]
     [:div.control
      [:label.checkbox
       [:input {:type      "checkbox"
                :name      (name-to-key [entity name])
                :on-change #(swap!
                             app-state
                             assoc-in [(name-to-key [entity]) (name-to-key [name])]
                             (boolean (.. % -target -checked)))}]
       (str " " o " ")]])])

(defn radio-box
  [entity name options]
  [:div.field
   (for [o options]
     ^{:key (str entity "-" name "-" o)}
     [:label.radio
      [:input {:name      name
               :type      "radio"
               :on-change #(swap!
                            app-state
                            assoc-in [(name-to-key [entity]) (name-to-key [name])] o)}]
      o])
   [:div.control]])

(defn send-form-data
  [entity]
  #(js/alert @app-state))

(defn form-button
  [entity]
  [:div.field.is-grouped
   [:div.control [:button.button.is-link
                  {:id "Submit"
                   :value "Submit"
                   :on-click #((send-form-data 1))}
                  "Submit"]]
   [:div.control [:button.button.is-link.is-light {:id "Cancel" :value "Cancel"} "Cancel"]]])

(defn build-entity
  [entity]
  (for [attr (:attrs entity)]
   (let [attr-type (:type attr)]
     (cond
       (= attr-type :number) (text-input
                               (:entity entity)
                               (:name attr)
                               "number")
       (and (= attr-type :string) (<= (:max attr) 255)) (text-input
                                                          (:entity entity)
                                                          (:name attr))
       (and (= attr-type :string) (> (:max attr) 255)) (text-area
                                                         (:entity entity)
                                                         (:name attr))
       (= attr-type :boolean) (check-box
                                (:entity entity)
                                (:name attr)
                                (:enum attr))
       (= attr-type :multiple-option) (check-box
                                        (:entity entity)
                                        (:name attr)
                                        (:enum attr))
       (and (= attr-type :single-option) (> (count (:enum attr)) 2)) (select-box
                                                                       (:entity entity)
                                                                       (:name attr)
                                                                       (:enum attr))
       (and (= attr-type :single-option) (= (count (:enum attr)) 2)) (radio-box
                                                                       (:entity entity)
                                                                       (:name attr)
                                                                       (:enum attr))
       (= attr-type :entity) (select-box
                               (:entity entity)
                               (:name attr)
                               [(get-attr-from-entity (:name attr) (:foreign-label attr))])))))


(defn app []
  [:div
   [:h1.title "Logic RAD"]
   [:div.tabs
    [:ul
     (for [entity entities]
       (if (= (:entity @app-state) (:entity entity))
         [:li.is-active {:on-click (fn [] (set-current-entity (:entity entity)))} [:a (:entity entity)]]
         [:li {:on-click (fn [] (set-current-entity (:entity entity)))} [:a (:entity entity)]]))]]
   ; table
   [:h2.title (str "Entity: " (current-entity))]
   (build-entity (first (filter (fn [e] (= (:entity e) (current-entity))) entities)))
   (form-button current-entity)])
