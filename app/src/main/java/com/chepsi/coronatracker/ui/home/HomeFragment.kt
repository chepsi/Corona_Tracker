package com.chepsi.coronatracker.ui.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
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

        fetchData()

        binding.countryCardInclude.countryCodePicker.setOnCountryChangeListener {
            fetchData()
        }

        binding.homeSwipeRefresh.setOnRefreshListener {
            fetchData()
        }

        viewModel.isLoading.observe(viewLifecycleOwner, Observer {
            binding.homeSwipeRefresh.isRefreshing = it
        })
    }

    override fun getTitle(): Int {
        return R.string.home
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    private fun fetchData(){
        viewModel.isLoading.postValue(true)
        val selectedCountryCode = binding.countryCardInclude.countryCodePicker.selectedCountryNameCode
        viewModel.fetchGlobalStatsData()
        viewModel.fetchCountriesStatistics(selectedCountryCode)
        viewModel.fetchCountryTimeline(selectedCountryCode)
    }
}