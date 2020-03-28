package com.chepsi.coronatracker.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.google.android.material.snackbar.Snackbar

abstract class BaseFragment< V : BaseViewModel> : Fragment(){
    protected lateinit var viewModel: V

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(getLayoutId(), container, false)
        init(view, savedInstanceState)
        activity!!.setTitle(getTitle())
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.snackBarMessage.observe(this,
            Observer { message: CharSequence -> Snackbar.make(view!!, message, Snackbar.LENGTH_SHORT).show() })
        viewModel.snackBarMessageLong.observe(
            this,
            Observer { message: CharSequence -> Snackbar.make(view!!, message, Snackbar.LENGTH_LONG).show() })
    }

    abstract fun init(view: View, savedInstanceState: Bundle?)

    abstract fun getTitle(): Int

    abstract fun getLayoutId(): Int

    protected fun showMessage(message: String){
        Snackbar.make(view!!, message, Snackbar.LENGTH_LONG).show()
    }
}