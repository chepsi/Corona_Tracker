package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class GlobalResults(
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

    @SerializedName("source")
    val source: StatSource
)

// {
//    "results":[
//       {
//          "total_cases":686276,
//          "total_recovered":146694,
//          "total_unresolved":508224,
//          "total_deaths":32277,
//          "total_new_cases_today":23194,
//          "total_new_deaths_today":1420,
//          "total_active_cases":507305,
//          "total_serious_cases":25426,
//          "source":{
//             "url":"https://thevirustracker.c
//          }
//       }
//    ],
//    "stat":"ok"
// }