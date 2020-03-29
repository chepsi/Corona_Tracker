package com.chepsi.coronatracker.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.chepsi.coronatracker.data.model.GlobalResults
import com.chepsi.coronatracker.data.repository.RestRepository
import com.chepsi.coronatracker.ui.base.BaseViewModel
import com.chepsi.coronatracker.utils.UiUtils
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

    fun fetchGlobalStatsData() = viewModelScope.launch{
        //val countryCode = "KE"
        val globalStats = restRepository.getGlobalStatistic()
        //val countryStat = restRepository.getStatisticFromCountry(countryCode)
        Timber.e(globalStats.toString())
        setData(globalStats.results)
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
    }
}

//{
//   "results":[
//      {
//         "total_cases":686276,
//         "total_recovered":146694,
//         "total_unresolved":508224,
//         "total_deaths":32277,
//         "total_new_cases_today":23194,
//         "total_new_deaths_today":1420,
//         "total_active_cases":507305,
//         "total_serious_cases":25426,
//         "source":{
//            "url":"https://thevirustracker.com/"
//         }
//      }
//   ],
//   "stat":"ok"
//}