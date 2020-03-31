package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class CountryStatistics(
    @SerializedName("countrydata")
    var countryData : ArrayList<CountryData>,

    @SerializedName("stat")
    var stat : String
)

//{
//  "countrydata": [
//    {
//      "info": {
//        "ourid": 83,
//        "title": "Kenya",
//        "code": "KE",
//        "source": "https://thevirustracker.com/kenya-coronavirus-information-ke"
//      },
//      "total_cases": 59,
//      "total_recovered": 1,
//      "total_unresolved": 0,
//      "total_deaths": 1,
//      "total_new_cases_today": 9,
//      "total_new_deaths_today": 0,
//      "total_active_cases": 57,
//      "total_serious_cases": 2,
//      "total_danger_rank": 109
//    }
//  ],
//  "stat": "ok"
//}