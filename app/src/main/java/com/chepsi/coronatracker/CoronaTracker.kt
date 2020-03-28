package com.chepsi.coronatracker

import android.app.Application
import com.chepsi.coronatracker.di.appModule
import com.chepsi.coronatracker.di.dataModule
import com.chepsi.coronatracker.di.networkModule
import org.koin.core.context.startKoin

class CoronaTracker : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(
                appModule,
                networkModule,
                dataModule
            ))
        }
    }
}