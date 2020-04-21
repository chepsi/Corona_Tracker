package com.chepsi.coronatracker.ui.graph

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.chepsi.coronatracker.R
import com.chepsi.coronatracker.data.model.CountryStatistics
import com.chepsi.coronatracker.ui.base.BaseFragment
import com.chepsi.coronatracker.ui.base.VoidViewModel
import com.google.gson.Gson
import org.koin.androidx.viewmodel.ext.android.getViewModel
import timber.log.Timber

class GraphFragment : BaseFragment<VoidViewModel>(){
    override fun init(view: View, savedInstanceState: Bundle?) {
        viewModel = getViewModel()
        val countryCode = arguments?.getString("countryCode", "KE")
        val countryTimelineString = arguments?.getString("countryTimeline", "")
        Timber.e(countryCode)
        view.findViewById<TextView>(R.id.testCountryCodeString).text = countryCode
        val countryTimeline = Gson().fromJson(countryTimelineString, CountryStatistics::class.java)
        Timber.e(countryTimeline.toString())
    }

    override fun getTitle(): Int {
        return R.string.graph
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_graph
    }
}