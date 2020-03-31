package com.chepsi.coronatracker.network

import com.chepsi.coronatracker.data.model.CountryStatistics
import com.chepsi.coronatracker.data.model.GlobalStatistics
import retrofit2.http.GET
import retrofit2.http.Query

interface CoronaTrackerApi {
    //Global statistics
    @GET("/free-api?global=stats")
    suspend fun getGlobalStats() : GlobalStatistics

//    'https://thevirustracker.com/free-api?countryTotal=US
    //Country statistics
    @GET("/free-api?")
    suspend fun getCountryStats(@Query("countryTotal") countryCode: String) : CountryStatistics

    //https://thevirustracker.com/free-api?countryTimeline=US
    @GET("/free-api?")
    suspend fun getCountryTimeline(@Query("countryTimeline") countryCode: String) : CountryStatistics
}