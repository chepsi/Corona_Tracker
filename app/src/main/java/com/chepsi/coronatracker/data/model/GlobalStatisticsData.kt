package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class GlobalStatisticsData(
    @SerializedName("countrycode")
    val countryCode: String,

    @SerializedName("countrylabel")
    val countryLabel: String,

    @SerializedName("showcountrylabelcases")
    val showCountryLabelCases: String,

    @SerializedName("labelpositioncases")
    val labelPositionCases: String,

    @SerializedName("showcountrylabeldeaths")
    val showCountryLabelDeaths: String,

    @SerializedName("labelpositiondeaths")
    val labelPositionDeaths: String,

    @SerializedName("showcountrylabelrecovered")
    val showCountryLabelRecovered: String,

    @SerializedName("labelpositionrecovered")
    val labelPositionRecovered: String,

    @SerializedName("casesoverride")
    val casesOverride: String,

    @SerializedName("deathsoverride")
    val deathsOverride: String,

    @SerializedName("recoveredoverride")
    val recoveredOverride: String,

    @SerializedName("emergencycasesoverride")
    val emergencyCasesOverride: String,

    @SerializedName("emergencydeathsoverride")
    val emergencyDeathsOverride: String,

    @SerializedName("totalcases")
    val totalCases: String,

    @SerializedName("totaldeaths")
    val totalDeaths: String,

    @SerializedName("totalrecovered")
    val totalRecovered: String
)

// [{"countrycode":"US","countrylabel":"USA","showcountrylabelcases":
// "no","labelpositioncases":"","showcountrylabeldeaths":"","labelpositiondeaths"
// :"","showcountrylabelrecovered":"no","labelpositionrecovered":"","casesoverride"
// :"","deathsoverride":"","recoveredoverride":"","columnsonrightshouldbeemptywhennotinuseifyouenteranumberitwillalwaysshowunlessyoudeleteit"
// :"","emergencycasesoverride":"","emergencydeathsoverride":"","totalcases":"","totaldeaths":"","totalrecovered":""}