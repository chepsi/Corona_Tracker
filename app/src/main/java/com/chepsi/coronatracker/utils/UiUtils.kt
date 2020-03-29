package com.chepsi.coronatracker.utils

import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

object UiUtils {
    fun stringFormatter(number: Int): String{
        val formatter = NumberFormat.getInstance(Locale.ENGLISH) as DecimalFormat
        formatter.applyPattern("#,###")
        return formatter.format(number)
    }
}