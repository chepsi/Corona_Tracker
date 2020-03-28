package com.chepsi.coronatracker.ui.main

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.chepsi.coronatracker.R
import com.chepsi.coronatracker.databinding.ActivityMainBinding
import com.chepsi.coronatracker.ui.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : BaseActivity<MainViewModel>() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = getViewModel()
        binding.viewModel = viewModel

        setSupportActionBar(binding.mainToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
    }

    override fun getRoot(): View {
        return binding.layoutMain
    }

}