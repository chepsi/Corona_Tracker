package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

data class NewsNewsItems(
    @SerializedName("newsid")
    val newsId: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("image")
    val imageUrl: String,

    @SerializedName("time")
    val time: String,

    @SerializedName("url")
    val url: String
)
/*
        "newsid": "IWMDHQ",
        "title": "‘Corona beer virus’ and ‘beer coronavirus’ searches increase as fears of outbreak spread",
        "image": "https://thevirustracker.com/news-images/thumbs/0/corona-beer-virus-and-beer-coronavirus-searches-increase-as-fears-of-outbreak-spread-IWMDHQ.jpg",
        "time": "27 February 2020 16:34",
        "url": "https://thevirustracker.com/story/corona-beer-virus-and-beer-coronavirus-searches-increase-as-fears-of-outbreak-spread-IWMDHQ"
 */