package com.chepsi.coronatracker.network

import com.chepsi.coronatracker.data.model.GlobalStatistics
import retrofit2.http.GET
import retrofit2.http.Query

interface CoronaTrackerApi {
    //Global statistics
    @GET("/free-api?global=stats")
    suspend fun getGlobalStats() : GlobalStatistics

    //Country statistics
    @GET("/free-api?countryTotals=ALL")
    suspend fun getCountryStats(@Query("countryTotals.equal") countryCode: String) : GlobalStatistics
}