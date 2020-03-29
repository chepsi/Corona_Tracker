package com.chepsi.coronatracker.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.chepsi.coronatracker.data.model.GlobalResults
import com.chepsi.coronatracker.data.repository.RestRepository
import com.chepsi.coronatracker.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import timber.log.Timber

class HomeViewModel(private val restRepository: RestRepository) : BaseViewModel(){
    val globalTotalCases = MutableLiveData<Int>()
    val globalRecoveredCases = MutableLiveData<Int>()
    val globalUnresolvedCases = MutableLiveData<Int>()
    val globalDeaths = MutableLiveData<Int>()
    val globalNewCases = MutableLiveData<Int>()
    val globalNewDeaths = MutableLiveData<Int>()
    val globalActiveCases = MutableLiveData<Int>()
    val globalSeriousCases = MutableLiveData<Int>()

    fun fetchGlobalStatsData() = viewModelScope.launch{
        //val countryCode = "KE"
        val globalStats = restRepository.getGlobalStatistic()
        //val countryStat = restRepository.getStatisticFromCountry(countryCode)
        Timber.e(globalStats.toString())
        setData(globalStats.results)
    }

    private fun setData(globalResultsArray: ArrayList<GlobalResults>){
        val globalResults = globalResultsArray.first()
        globalTotalCases.postValue(globalResults.totalCases)
        globalTotalCases.postValue(globalResults.totalCases)
        globalRecoveredCases.postValue(globalResults.totalRecovered)
        globalUnresolvedCases.postValue(globalResults.totalUnresolved)
        globalDeaths.postValue(globalResults.totalDeaths)
        globalNewCases.postValue(globalResults.totalNewCasesToday)
        globalNewDeaths.postValue(globalResults.totalNewDeathsToday)
        globalActiveCases.postValue(globalResults.totalActiveCases)
        globalSeriousCases.postValue(globalResults.totalSeriousCases)
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