package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class TimeLineItems(
    @SerializedName("date")
    val date: String,

    @SerializedName("new_daily_case")
    val newDailyCase: Int,

    @SerializedName("new_daily_deaths")
    val newDailyDeaths: Int,

    @SerializedName("total_cases")
    val totalCases: Int,

    @SerializedName("total_recoveries")
    val totalRecoveries: Int,

    @SerializedName("total_deaths")
    val totalDeaths: Int
)

//1/24/2020":{"new_daily_cases":1,"new_daily_deaths":0,"total_cases":2,"total_recoveries":0,"total_deaths":0},