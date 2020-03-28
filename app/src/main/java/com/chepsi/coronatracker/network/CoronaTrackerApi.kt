package com.chepsi.coronatracker.network

import com.chepsi.coronatracker.data.model.*
import retrofit2.http.GET
import retrofit2.http.Query

interface CoronaTrackerApi {
    //Global statistics
    @GET("/free-api?global=stats")
    suspend fun getGlobalStats() : GlobalStatistics

    //All country statistics
    @GET("/free-api?countryTotals=ALL")
    suspend fun getCountriesStatistic() : CountriesStatistics

    //Single country statistic
    @GET("/free-api?")
    suspend fun getCountryStatistic(@Query("countryCode.equals") countryCode: String) : CountryStatistic

    //Country news API
    @GET("/free-api?countryNewsTotal=US")
    suspend fun getVirusNews() : VirusNews

    //Full timeline API
    @GET("/timeline/map-data.json")
    suspend fun getFullTimelineData() : TimelineData

    //Country timeline API
    @GET("free-api?")
    suspend fun getCountryTimelineData(@Query("countryTimeline.equals")countryCode: String) : TimelineData
}