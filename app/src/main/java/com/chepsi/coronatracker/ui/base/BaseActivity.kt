package com.chepsi.coronatracker.ui.base

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.google.android.material.snackbar.Snackbar

abstract class BaseActivity<V: BaseViewModel> : AppCompatActivity(){
    lateinit var viewModel: V

    override fun onStart() {
        super.onStart()
        viewModel.snackBarMessage.observe(this, getSnackBarObserver())
    }

    protected open fun getSnackBarObserver(): Observer<CharSequence>{
        return Observer { message: CharSequence -> Snackbar.make(getRoot(), message, Snackbar.LENGTH_LONG).show() }
    }

    abstract fun getRoot(): View

    fun showMessage(message: CharSequence){
        Snackbar.make(getRoot(), message, Snackbar.LENGTH_LONG).show()
    }
}