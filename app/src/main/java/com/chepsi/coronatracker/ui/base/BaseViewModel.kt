package com.chepsi.coronatracker.ui.base

import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel(){
    val snackBarMessage = SnackBarMessage()
    val snackBarMessageLong = SnackBarMessage()

    protected fun showSnackBar(message: CharSequence?){
        snackBarMessage.value = message
    }

    protected fun showSnackbarLong(message: CharSequence?) {
        snackBarMessageLong.value = message
    }
}