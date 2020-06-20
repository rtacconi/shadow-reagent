(ns app.entities)

(def entities [{:entity "Person"
                :attrs  [{:name     "First Name"
                          :type     :string
                          :required true
                          :min      1
                          :max      150}
                         {:name     "Last Name"
                          :type     :string
                          :required true
                          :min      1
                          :max      150}
                         {:name     "Age"
                          :type     :number
                          :required true
                          :min      1
                          :max      150}
                         {:name "Company"
                          :type :entity
                          :foreign-labels ["Name"]
                          :required false}
                         {:name     "Eyes Color"
                          :type     :single-option
                          :required true
                          :enum     ["Brown" "Gray" "Blue"]}
                         {:name     "Hair Color"
                          :type     :single-option
                          :required true
                          :enum     ["Black" "Grey" "Blonde" "Brown" "Red"]}
                         {:name     "Car"
                          :type     :multiple-option
                          :required true
                          :enum     ["Ferrari" "Fiat" "Volvo"]}
                         {:name     "Biography"
                          :type     :string
                          :required false
                          :min      1
                          :max      1500}
                         {:name    "Sex"
                          :type    :single-option
                          :require true
                          :state   nil
                          :enum    ["Male" "Female"]}
                         {:name     "Terms"
                          :type     :boolean
                          :required false
                          :state    false
                          :enum  [" I agree to terms and conditions"]}]}
               {:entity "Company"
                :attrs [{:name     "Name"
                         :type     :string
                         :required true
                         :min      1
                         :max      150}
                        {:name     "Trading name"
                         :type     :string
                         :required true
                         :min      1
                         :max      150}
                        {:name     "Number Of Employees"
                         :type     :number
                         :required true
                         :min      1
                         :max      1500000}]}
               {:entity "Property"
                :attrs [{:name     "Street Number"
                         :type     :number
                         :required true
                         :min      1
                         :max      199000}
                        {:name     "Street Name"
                         :type     :string
                         :required true
                         :min      1
                         :max      150}
                        {:name     "City"
                         :type     :string
                         :required true
                         :min      1
                         :max      150}
                        {:name     "Post Code"
                         :type     :string
                         :required true
                         :min      1
                         :max      8}
                        {:name     "Countries"
                         :type     :single-option
                         :required true
                         :enum     ["Ireland" "United States" "United Kingdom"]}]}
               {:entity "Offer"
                :attrs [{:name     "Offer Price"
                         :type     :number
                         :required true
                         :min      1
                         :max      1500000000}
                        {:name "Property"
                         :type :entity
                         :foreign-labels ["Street Name"]
                         :required false}]}])
