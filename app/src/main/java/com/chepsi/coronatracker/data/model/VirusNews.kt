package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class VirusNews(
    @SerializedName("countrydata")
    val countryData: NewsCountryData,

    @SerializedName("countrynewsitems")
    val countryNewsItems: NewsNewsItems
)
/*
{"countrydata":[{"info":{"ourid":167, "title":"USA", "code":"US", "source":"https://thevirustracker.com/usa-coronavirus-information-us"}}], "countrynewsitems":[{"1":{"newsid":"IWMDHQ", "title":"‘Corona beer virus’ and ‘beer coronavirus’ searches increase as fears of outbreak spread", "image":"https://thevirustracker.com/news-images/thumbs/0/corona-beer-virus-and-beer-coronavirus-searches-increase-as-fears-of-outbreak-spread-IWMDHQ.jpg", "time":"27 February 2020 16:34", "url":"https://thevirustracker.com/story/corona-beer-virus-and-beer-coronavirus-searches-increase-as-fears-of-outbreak-spread-IWMDHQ"},"stat":"ok"}]}
 */