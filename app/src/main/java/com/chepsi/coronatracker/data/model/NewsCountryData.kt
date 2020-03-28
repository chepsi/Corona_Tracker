package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class NewsCountryData (
    @SerializedName("ourid")
    val ourId: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("code")
    val code: String,

    @SerializedName("source")
    val source: String
)

/* Example data
"ourid": 167,
"title": "USA",
"code": "US",
"source": "https://thevirustracker.com/usa-coronavirus-information-us"

 */