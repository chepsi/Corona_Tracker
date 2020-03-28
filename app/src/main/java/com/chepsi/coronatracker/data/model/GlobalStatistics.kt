package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class GlobalStatistics(
    @SerializedName("date")
    val date: String,

    @SerializedName("data")
    val data: GlobalStatisticsData
)
//[{"date":"1/22/20","data":[{"countrycode":"US","countrylabel":"USA","showcountrylabelcases":"no","labelpositioncases":"","showcountrylabeldeaths":"","labelpositiondeaths":"","showcountrylabelrecovered":"no","labelpositionrecovered":"","casesoverride":"","deathsoverride":"","recoveredoverride":"","columnsonrightshouldbeemptywhennotinuseifyouenteranumberitwillalwaysshowunlessyoudeleteit":"","emergencycasesoverride":"","emergencydeathsoverride":"","totalcases":"","totaldeaths":"","totalrecovered":""}]