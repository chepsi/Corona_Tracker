package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class CountryData(
    @SerializedName("info")
    val info: NewsCountryData,

    @SerializedName("total_cases")
    val totalCases: NewsCountryData,

    @SerializedName("total_recovered")
    val totalRecovered: NewsCountryData,

    @SerializedName("total_unresolved")
    val totalUnresolved: NewsCountryData,

    @SerializedName("total_deaths")
    val totalDeaths: NewsCountryData,

    @SerializedName("total_new_cases_today")
    val totalNewCasesToday: NewsCountryData,

    @SerializedName("total_new_deaths_today")
    val totalNewDeathsToday: NewsCountryData,

    @SerializedName("total_active_cases_today")
    val totalActiveCasesToday: NewsCountryData,

    @SerializedName("total_serious_cases")
    val totalSeriousCases: NewsCountryData

)

/*
      "info": {
        "ourid": 167,
        "title": "USA",
        "code": "US",
        "source": "https://thevirustracker.com/usa-coronavirus-information-us"
      },
      "total_cases": 2340,
      "total_recovered": 41,
      "total_unresolved": 0,
      "total_deaths": 50,
      "total_new_cases_today": 93,
      "total_new_deaths_today": 1,
      "total_active_cases": 2249,
      "total_serius_cases": 10
 */