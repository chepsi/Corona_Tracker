package com.chepsi.coronatracker.ui.home

import android.os.Bundle
import android.view.View
import com.chepsi.coronatracker.R
import com.chepsi.coronatracker.databinding.FragmentHomeBinding
import com.chepsi.coronatracker.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.getViewModel

class HomeFragment : BaseFragment<HomeViewModel>(){
    lateinit var binding: FragmentHomeBinding
    override fun init(view: View, savedInstanceState: Bundle?) {
        binding = FragmentHomeBinding.bind(view)
        viewModel = getViewModel()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.fetchGlobalStatsData()
        viewModel.fetchCountriesStatistics()
        viewModel.fetchCountryTimeline()
    }

    override fun getTitle(): Int {
        return R.string.home
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

}