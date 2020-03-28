package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

//Todo finish up on this class
data class TimelineData(
    @SerializedName("countrytimelinedata")
    val countryTimeLineData: NewsCountryData,

    @SerializedName("timelineitems")
    val timeLineItems: ArrayList<TimeLineItems>,

    @SerializedName("stat")
    val stat: String
)

/*
{"countrytimelinedata":[{"info":{"ourid":167, "title":"USA", "code":"US", "source":"https://thevirustracker.com/usa-coronavirus-information-us"}}],
"timelineitems":[{"1/23/2020":{"new_daily_cases":1,"new_daily_deaths":0,"total_cases":1,"total_recoveries":0,"total_deaths":0},"
1/24/2020":{"new_daily_cases":1,"new_daily_deaths":0,"total_cases":2,"total_recoveries":0,"total_deaths":0},
.
..
...
"stat":"ok"}]}
 */