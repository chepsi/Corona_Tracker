package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

//Todo finish up on this
data class CountryStatistic(
    @SerializedName(" ")
    val name: String
)
/*
{"countrydata":[{"info":{"ourid":167, "title":"USA", "code":"US", "source":"https://thevirustracker.com/usa-coronavirus-information-us"}, "total_cases":2340, "total_recovered":41, "total_unresolved":0, "total_deaths":50, "total_new_cases_today":93, "total_new_deaths_today":1, "total_active_cases":2249, "total_serius_cases":10}], "countrynewsitems":[{"1":{"newsid":2150, "title":"Coronavirus USA Update: Second US Death Confirmed New York Reports First Case", "image":"https://thevirustracker.com/news-images//coronavirus-usa-update-second-us-death-confirmed-new-york-reports-first-case-lvhcYw.jpg", "time":"2 March 2020 14:23", "url":"https://thevirustracker.com/story/coronavirus-usa-update-second-us-death-confirmed-new-york-reports-first-case-lvhcYw"},"stat":"ok"}]}
 */