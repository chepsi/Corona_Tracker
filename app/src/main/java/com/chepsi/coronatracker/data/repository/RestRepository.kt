package com.chepsi.coronatracker.data.repository

import com.chepsi.coronatracker.network.CoronaTrackerApi

class RestRepository(private val coronaTrackerApi: CoronaTrackerApi) {

    suspend fun getGlobalStatistic() = coronaTrackerApi.getGlobalStats()

    suspend fun getCountriesStatistic() = coronaTrackerApi.getCountriesStatistic()

    suspend fun getCountryStatistic(countryCode: String) = coronaTrackerApi.getCountryStatistic(countryCode = countryCode)

    suspend fun getVirusNews() = coronaTrackerApi.getVirusNews()

    suspend fun getFullTimeline() = coronaTrackerApi.getFullTimelineData()

}