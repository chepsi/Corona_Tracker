package com.chepsi.coronatracker.ui.base

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import java.util.ArrayList

abstract class DataBoundAdapter<S : BaseListItem, T : ViewDataBinding>(@param:LayoutRes @field:LayoutRes
                                                                       private val layoutId: Int, protected var data: ArrayList<S>?) : BaseDataBoundAdapter<T>() {

    override fun getItemLayoutId(position: Int): Int {
        return layoutId
    }

    override fun getItemCount(): Int {
        return if (data != null) {
            data!!.size
        } else 0
    }

    fun updateData(data: List<S>?) {
        if (data == null && this.data != null) {
            this.data!!.clear()
        } else if (data != null && this.data == null) {
            this.data = ArrayList(data)
        } else if (data != null) {
            this.data!!.clear()
            this.data!!.addAll(data)
        }

        notifyDataSetChanged()
    }
}