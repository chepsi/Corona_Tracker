package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class CountryData(
    @SerializedName("info")
    val info: Info,

    @SerializedName("total_cases")
    val totalCases: Int,

    @SerializedName("total_recovered")
    val totalRecovered: Int,

    @SerializedName("total_unresolved")
    val totalUnresolved: Int,

    @SerializedName("total_deaths")
    val totalDeaths: Int,

    @SerializedName("total_new_cases_today")
    val totalNewCasesToday: Int,

    @SerializedName("total_new_deaths_today")
    val totalNewDeathsToday: Int,

    @SerializedName("total_active_cases")
    val totalActiveCases: Int,

    @SerializedName("total_serious_cases")
    val totalSeriousCases: Int,

    @SerializedName("total_danger_rank")
    val totalDangerRank: Int
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