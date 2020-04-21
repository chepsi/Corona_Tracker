package com.chepsi.coronatracker.ui.base

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer

class SnackBarMessage : SingleLiveEvent<CharSequence>(){
    fun observe(owner: LifecycleOwner, observer: SnackBarObserver){
        super.observe(owner, Observer { s: CharSequence? ->
            if (s==null){
                return@Observer
            }

            observer.onNewMessage(s)
        })
    }

    interface SnackBarObserver{
        fun onNewMessage(message: CharSequence?)
    }
}