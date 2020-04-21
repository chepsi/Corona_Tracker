package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("ourid")
    val ourId: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("code")
    val code: String,

    @SerializedName("source")
    val source: String
)

// {
////      "info": {
////        "ourid": 83,
////        "title": "Kenya",
////        "code": "KE",
////        "source": "https://thevirustracker.com/kenya-coronavirus-information-ke"
////      },