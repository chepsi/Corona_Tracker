package com.chepsi.coronatracker.ui.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class DataBoundViewHolder<T : ViewDataBinding>(val binding: T) : RecyclerView.ViewHolder(binding.root) {
    companion object {

        fun <T : ViewDataBinding> create(parent: ViewGroup, @LayoutRes layoutId: Int): DataBoundViewHolder<T> {
            val binding = DataBindingUtil.inflate<T>(LayoutInflater.from(parent.context), layoutId, parent, false)
            return DataBoundViewHolder(binding)
        }
    }
}
