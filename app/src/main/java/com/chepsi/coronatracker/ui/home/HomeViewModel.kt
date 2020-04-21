package com.chepsi.coronatracker.ui.home

import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.chepsi.coronatracker.R
import com.chepsi.coronatracker.data.model.CountryStatistics
import com.chepsi.coronatracker.data.model.GlobalResults
import com.chepsi.coronatracker.data.repository.RestRepository
import com.chepsi.coronatracker.ui.base.BaseViewModel
import com.chepsi.coronatracker.utils.UiUtils
import com.google.gson.Gson
import kotlinx.coroutines.launch
import timber.log.Timber

class HomeViewModel(private val restRepository: RestRepository) : BaseViewModel(){
    val globalTotalCases = MutableLiveData<String>()
    val globalRecoveredCases = MutableLiveData<String>()
    val globalUnresolvedCases = MutableLiveData<String>()
    val globalDeaths = MutableLiveData<String>()
    val globalNewCases = MutableLiveData<String>()
    val globalNewDeaths = MutableLiveData<String>()
    val globalActiveCases = MutableLiveData<String>()
    val globalSeriousCases = MutableLiveData<String>()
    val countryName = MutableLiveData<String>()
    val countryNewCases = MutableLiveData<String>()
    val countryTreatedCases = MutableLiveData<String>()
    val isLoading = MutableLiveData<Boolean>()
    lateinit var countryCodeString: String
    lateinit var countryTimeline : CountryStatistics

    fun fetchGlobalStatsData() = viewModelScope.launch{
        val globalStats = restRepository.getGlobalStatistic()
        Timber.e(globalStats.toString())
        setData(globalStats.results)
    }

    fun fetchCountriesStatistics(countryCode: String) = viewModelScope.launch {
        val countryStats = restRepository.getStatisticFromCountry(countryCode)
        setCountryData(countryStats)
    }

    fun fetchCountryTimeline(countryCode: String) = viewModelScope.launch {
        countryCodeString = countryCode
        countryTimeline = restRepository.getCountryTimeline(countryCode)
    }

    private fun setData(globalResultsArray: ArrayList<GlobalResults>){
        val globalResults = globalResultsArray.first()
        globalTotalCases.postValue(UiUtils.stringFormatter(globalResults.totalCases))
        globalRecoveredCases.postValue(UiUtils.stringFormatter(globalResults.totalRecovered))
        globalUnresolvedCases.postValue(UiUtils.stringFormatter(globalResults.totalUnresolved))
        globalDeaths.postValue(UiUtils.stringFormatter(globalResults.totalDeaths))
        globalNewCases.postValue(UiUtils.stringFormatter(globalResults.totalNewCasesToday))
        globalNewDeaths.postValue(UiUtils.stringFormatter(globalResults.totalNewDeathsToday))
        globalActiveCases.postValue(UiUtils.stringFormatter(globalResults.totalActiveCases))
        globalSeriousCases.postValue(UiUtils.stringFormatter(globalResults.totalSeriousCases))
        isLoading.postValue(false)
    }

    private fun setCountryData(countryStatistics: CountryStatistics){
        isLoading.postValue(false)
        try {
            val countryData = countryStatistics.countryData.first()
            countryName.postValue(countryStatistics.countryData.first().info.title)
            countryNewCases.postValue(UiUtils.stringFormatter(countryData.totalNewCasesToday))
            countryTreatedCases.postValue(UiUtils.stringFormatter(countryData.totalRecovered))
        }
        catch (e: IllegalArgumentException){
            showSnackBar("We don't have any results from the selected country")
            Timber.e(e)
        }
        catch (e: NullPointerException){
            Timber.e(e)
        }
    }

    fun linkToViewGraph(view: View){
        view.findNavController().navigate(R.id.action_homeFragment_to_graphFragment, bundleOf(
            "countryCode" to countryCodeString,
            "countryTimeline" to  Gson().toJson(countryTimeline)
        ))
    }
}