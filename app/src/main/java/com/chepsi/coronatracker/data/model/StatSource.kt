package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class StatSource(
    @SerializedName("url")
    val statSource: String
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