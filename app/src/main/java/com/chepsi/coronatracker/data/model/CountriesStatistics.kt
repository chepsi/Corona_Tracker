package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class CountriesStatistics(
    @SerializedName("ourid")
    var id: Int,

    @SerializedName("title")
    var title: String,

    @SerializedName("code")
    var code: String,

    @SerializedName("source")
    var source: String,

    @SerializedName("total_cases")
    var total_cases: Int,

    @SerializedName("total_recovered")
    var total_recovered: Int,

    @SerializedName("total_unresolved")
    var total_unresolved: Int,

    @SerializedName("total_deaths")
    var total_deaths: Int,

    @SerializedName("total_new_cases_today")
    var total_new_cases_today: Int,

    @SerializedName("total_new_deaths_today")
    var total_new_deaths_today: Int,

    @SerializedName("total_active_cases")
    var total_active_cases: Int,

    @SerializedName("total_serious_cases")
    var total_serious: Int
)
/*
Example data set
            "ourid":1,
            "title":"Afghanistan",
            "code":"AF",
            "source":"https://thevirustracker.com/afghanistan-coronavirus-information-af",
            "total_cases":94,
            "total_recovered":2,
            "total_unresolved":0,
            "total_deaths":4,
            "total_new_cases_today":0,
            "total_new_deaths_today":0,
            "total_active_cases":88,
            "total_serious_cases":0
 */
/*
{"sitedata":[{"info":{"source":"https://thevirustracker.com/"}}], "countryitems":[{"1":{"ourid":1, "title":"Afghanistan", "code":"AF", "source":"https://thevirustracker.com/afghanistan-coronavirus-information-af", "total_cases":94, "total_recovered":2, "total_unresolved":0, "total_deaths":4, "total_new_cases_today":0, "total_new_deaths_today":0, "total_active_cases":88, "total_serious_cases":0},"stat":"ok"}]}
 */