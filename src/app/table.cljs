(ns app.table)

(def table
  [:table.table
   [:thead
    [:tr
     [:th [:abbr {:title "Position"} "Pos"]]
     [:th "Team"]
     [:th [:abbr {:title "Played"} "Pld"]]
     [:th [:abbr {:title "Won"} "W"]]
     [:th [:abbr {:title "Drawn"} "D"]]
     [:th [:abbr {:title "Lost"} "L"]]
     [:th [:abbr {:title "Goals for"} "GF"]]
     [:th [:abbr {:title "Goals against"} "GA"]]
     [:th [:abbr {:title "Goal difference"} "GD"]]
     [:th [:abbr {:title "Points"} "Pts"]]
     [:th "Qualification or relegation"]]]
   [:tfoot
    [:tr
     [:th [:abbr {:title "Position"} "Pos"]]
     [:th "Team"]
     [:th [:abbr {:title "Played"} "Pld"]]
     [:th [:abbr {:title "Won"} "W"]]
     [:th [:abbr {:title "Drawn"} "D"]]
     [:th [:abbr {:title "Lost"} "L"]]
     [:th [:abbr {:title "Goals for"} "GF"]]
     [:th [:abbr {:title "Goals against"} "GA"]]
     [:th [:abbr {:title "Goal difference"} "GD"]]
     [:th [:abbr {:title "Points"} "Pts"]]
     [:th "Qualification or relegation"]]]
   [:tbody
    [:tr
     [:th "1"]
     [:td
      [:a
       {:title "Leicester City F.C.",
        :href "https://en.wikipedia.org/wiki/Leicester_City_F.C."}
       "Leicester City"]
      " "
      [:strong "(C)"]]
     [:td "38"]
     [:td "23"]
     [:td "12"]
     [:td "3"]
     [:td "68"]
     [:td "36"]
     [:td "+32"]
     [:td "81"]
     [:td
      "Qualification for the "
      [:a
       {:title "2016–17 UEFA Champions League",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_UEFA_Champions_League#Group_stage"}
       "Champions League group stage"]]]
    [:tr
     [:th "2"]
     [:td
      [:a
       {:title "Arsenal F.C.",
        :href "https://en.wikipedia.org/wiki/Arsenal_F.C."}
       "Arsenal"]]
     [:td "38"]
     [:td "20"]
     [:td "11"]
     [:td "7"]
     [:td "65"]
     [:td "36"]
     [:td "+29"]
     [:td "71"]
     [:td
      "Qualification for the "
      [:a
       {:title "2016–17 UEFA Champions League",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_UEFA_Champions_League#Group_stage"}
       "Champions League group stage"]]]
    [:tr
     [:th "3"]
     [:td
      [:a
       {:title "Tottenham Hotspur F.C.",
        :href "https://en.wikipedia.org/wiki/Tottenham_Hotspur_F.C."}
       "Tottenham Hotspur"]]
     [:td "38"]
     [:td "19"]
     [:td "13"]
     [:td "6"]
     [:td "69"]
     [:td "35"]
     [:td "+34"]
     [:td "70"]
     [:td
      "Qualification for the "
      [:a
       {:title "2016–17 UEFA Champions League",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_UEFA_Champions_League#Group_stage"}
       "Champions League group stage"]]]
    [:tr.is-selected
     [:th "4"]
     [:td
      [:a
       {:title "Manchester City F.C.",
        :href "https://en.wikipedia.org/wiki/Manchester_City_F.C."}
       "Manchester City"]]
     [:td "38"]
     [:td "19"]
     [:td "9"]
     [:td "10"]
     [:td "71"]
     [:td "41"]
     [:td "+30"]
     [:td "66"]
     [:td
      "Qualification for the "
      [:a
       {:title "2016–17 UEFA Champions League",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_UEFA_Champions_League#Play-off_round"}
       "Champions League play-off round"]]]
    [:tr
     [:th "5"]
     [:td
      [:a
       {:title "Manchester United F.C.",
        :href "https://en.wikipedia.org/wiki/Manchester_United_F.C."}
       "Manchester United"]]
     [:td "38"]
     [:td "19"]
     [:td "9"]
     [:td "10"]
     [:td "49"]
     [:td "35"]
     [:td "+14"]
     [:td "66"]
     [:td
      "Qualification for the "
      [:a
       {:title "2016–17 UEFA Europa League",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_UEFA_Europa_League#Group_stage"}
       "Europa League group stage"]]]
    [:tr
     [:th "6"]
     [:td
      [:a
       {:title "Southampton F.C.",
        :href "https://en.wikipedia.org/wiki/Southampton_F.C."}
       "Southampton"]]
     [:td "38"]
     [:td "18"]
     [:td "9"]
     [:td "11"]
     [:td "59"]
     [:td "41"]
     [:td "+18"]
     [:td "63"]
     [:td
      "Qualification for the "
      [:a
       {:title "2016–17 UEFA Europa League",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_UEFA_Europa_League#Group_stage"}
       "Europa League group stage"]]]
    [:tr
     [:th "7"]
     [:td
      [:a
       {:title "West Ham United F.C.",
        :href "https://en.wikipedia.org/wiki/West_Ham_United_F.C."}
       "West Ham United"]]
     [:td "38"]
     [:td "16"]
     [:td "14"]
     [:td "8"]
     [:td "65"]
     [:td "51"]
     [:td "+14"]
     [:td "62"]
     [:td
      "Qualification for the "
      [:a
       {:title "2016–17 UEFA Europa League",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_UEFA_Europa_League#Third_qualifying_round"}
       "Europa League third qualifying round"]]]
    [:tr
     [:th "8"]
     [:td
      [:a
       {:title "Liverpool F.C.",
        :href "https://en.wikipedia.org/wiki/Liverpool_F.C."}
       "Liverpool"]]
     [:td "38"]
     [:td "16"]
     [:td "12"]
     [:td "10"]
     [:td "63"]
     [:td "50"]
     [:td "+13"]
     [:td "60"]
     [:td]]
    [:tr
     [:th "9"]
     [:td
      [:a
       {:title "Stoke City F.C.",
        :href "https://en.wikipedia.org/wiki/Stoke_City_F.C."}
       "Stoke City"]]
     [:td "38"]
     [:td "14"]
     [:td "9"]
     [:td "15"]
     [:td "41"]
     [:td "55"]
     [:td "−14"]
     [:td "51"]
     [:td]]
    [:tr
     [:th "10"]
     [:td
      [:a
       {:title "Chelsea F.C.",
        :href "https://en.wikipedia.org/wiki/Chelsea_F.C."}
       "Chelsea"]]
     [:td "38"]
     [:td "12"]
     [:td "14"]
     [:td "12"]
     [:td "59"]
     [:td "53"]
     [:td "+6"]
     [:td "50"]
     [:td]]
    [:tr
     [:th "11"]
     [:td
      [:a
       {:title "Everton F.C.",
        :href "https://en.wikipedia.org/wiki/Everton_F.C."}
       "Everton"]]
     [:td "38"]
     [:td "11"]
     [:td "14"]
     [:td "13"]
     [:td "59"]
     [:td "55"]
     [:td "+4"]
     [:td "47"]
     [:td]]
    [:tr
     [:th "12"]
     [:td
      [:a
       {:title "Swansea City A.F.C.",
        :href "https://en.wikipedia.org/wiki/Swansea_City_A.F.C."}
       "Swansea City"]]
     [:td "38"]
     [:td "12"]
     [:td "11"]
     [:td "15"]
     [:td "42"]
     [:td "52"]
     [:td "−10"]
     [:td "47"]
     [:td]]
    [:tr
     [:th "13"]
     [:td
      [:a
       {:title "Watford F.C.",
        :href "https://en.wikipedia.org/wiki/Watford_F.C."}
       "Watford"]]
     [:td "38"]
     [:td "12"]
     [:td "9"]
     [:td "17"]
     [:td "40"]
     [:td "50"]
     [:td "−10"]
     [:td "45"]
     [:td]]
    [:tr
     [:th "14"]
     [:td
      [:a
       {:title "West Bromwich Albion F.C.",
        :href
               "https://en.wikipedia.org/wiki/West_Bromwich_Albion_F.C."}
       "West Bromwich Albion"]]
     [:td "38"]
     [:td "10"]
     [:td "13"]
     [:td "15"]
     [:td "34"]
     [:td "48"]
     [:td "−14"]
     [:td "43"]
     [:td]]
    [:tr
     [:th "15"]
     [:td
      [:a
       {:title "Crystal Palace F.C.",
        :href "https://en.wikipedia.org/wiki/Crystal_Palace_F.C."}
       "Crystal Palace"]]
     [:td "38"]
     [:td "11"]
     [:td "9"]
     [:td "18"]
     [:td "39"]
     [:td "51"]
     [:td "−12"]
     [:td "42"]
     [:td]]
    [:tr
     [:th "16"]
     [:td
      [:a
       {:title "A.F.C. Bournemouth",
        :href "https://en.wikipedia.org/wiki/A.F.C._Bournemouth"}
       "AFC Bournemouth"]]
     [:td "38"]
     [:td "11"]
     [:td "9"]
     [:td "18"]
     [:td "45"]
     [:td "67"]
     [:td "−22"]
     [:td "42"]
     [:td]]
    [:tr
     [:th "17"]
     [:td
      [:a
       {:title "Sunderland A.F.C.",
        :href "https://en.wikipedia.org/wiki/Sunderland_A.F.C."}
       "Sunderland"]]
     [:td "38"]
     [:td "9"]
     [:td "12"]
     [:td "17"]
     [:td "48"]
     [:td "62"]
     [:td "−14"]
     [:td "39"]
     [:td]]
    [:tr
     [:th "18"]
     [:td
      [:a
       {:title "Newcastle United F.C.",
        :href "https://en.wikipedia.org/wiki/Newcastle_United_F.C."}
       "Newcastle United"]
      " "
      [:strong "(R)"]]
     [:td "38"]
     [:td "9"]
     [:td "10"]
     [:td "19"]
     [:td "44"]
     [:td "65"]
     [:td "−21"]
     [:td "37"]
     [:td
      "Relegation to the "
      [:a
       {:title "2016–17 Football League Championship",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_Football_League_Championship"}
       "Football League Championship"]]]
    [:tr
     [:th "19"]
     [:td
      [:a
       {:title "Norwich City F.C.",
        :href "https://en.wikipedia.org/wiki/Norwich_City_F.C."}
       "Norwich City"]
      " "
      [:strong "(R)"]]
     [:td "38"]
     [:td "9"]
     [:td "7"]
     [:td "22"]
     [:td "39"]
     [:td "67"]
     [:td "−28"]
     [:td "34"]
     [:td
      "Relegation to the "
      [:a
       {:title "2016–17 Football League Championship",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_Football_League_Championship"}
       "Football League Championship"]]
     "    "]
    [:tr
     [:th "20"]
     [:td
      [:a
       {:title "Aston Villa F.C.",
        :href "https://en.wikipedia.org/wiki/Aston_Villa_F.C."}
       "Aston Villa"]
      " "
      [:strong "(R)"]]
     [:td "38"]
     [:td "3"]
     [:td "8"]
     [:td "27"]
     [:td "27"]
     [:td "76"]
     [:td "−49"]
     [:td "17"]
     [:td
      "Relegation to the "
      [:a
       {:title "2016–17 Football League Championship",
        :href
               "https://en.wikipedia.org/wiki/2016%E2%80%9317_Football_League_Championship"}
       "Football League Championship"]]]]])
