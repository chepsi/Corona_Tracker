package com.chepsi.coronatracker.ui.home

import com.chepsi.coronatracker.data.repository.RestRepository
import com.chepsi.coronatracker.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers

class HomeViewModel(private val restRepository: RestRepository) : BaseViewModel(){

    suspend fun fetchNews() = with(Dispatchers.IO){
        val countryCode = "KE"
        restRepository.getCountryStatistic(countryCode)
    }
}