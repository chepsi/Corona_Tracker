package com.chepsi.coronatracker.data.repository

import com.chepsi.coronatracker.network.CoronaTrackerApi

class RestRepository(private val coronaTrackerApi: CoronaTrackerApi) {

    suspend fun getGlobalStatistic() = coronaTrackerApi.getGlobalStats()

    suspend fun getStatisticFromCountry(countryCode: String) = coronaTrackerApi.getCountryStats(countryCode = countryCode)
}