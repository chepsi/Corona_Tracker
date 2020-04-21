package com.chepsi.coronatracker.di

import com.chepsi.coronatracker.data.repository.RestRepository
import com.chepsi.coronatracker.network.CoronaTrackerApi
import com.chepsi.coronatracker.ui.base.VoidViewModel
import com.chepsi.coronatracker.ui.home.HomeViewModel
import com.chepsi.coronatracker.ui.main.MainViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    viewModel { MainViewModel() }
    viewModel { HomeViewModel(get()) }

    viewModel { VoidViewModel() }
}

val networkModule = module {
    single { provideRetrofit(get()) }
    factory { provideOkHTTPClient() }
    factory { provideTrackerAPI(get()) }
}

val dataModule = module{
    single { RestRepository(get()) }
}
fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit{
    return Retrofit.Builder()
        .baseUrl("https://thevirustracker.com")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
fun provideOkHTTPClient(): OkHttpClient{
    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    return OkHttpClient()
        .newBuilder()
        .addInterceptor(loggingInterceptor)
        .build()
}

fun provideTrackerAPI(retrofit: Retrofit): CoronaTrackerApi = retrofit.create(CoronaTrackerApi::class.java)