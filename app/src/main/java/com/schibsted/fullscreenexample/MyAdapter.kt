package com.schibsted.fullscreenexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val activity: AppCompatActivity) : ListAdapter<RecyclerViewItem, BaseHolder>(ItemDiffCallback) {

    private val inflater = activity.layoutInflater

    override fun getItemViewType(position: Int) = when (getItem(position)) {
        is RegularItem -> 0
        is AdItem -> 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder {
        return when (viewType) {
            0 -> NormalItemHolder(inflater.inflate(R.layout.list_item_regular, parent, false))
            1 -> AdItemHolder(inflater.inflate(R.layout.list_item_fullscreen, parent, false))
            else -> throw IllegalArgumentException("This is not how we play :)")
        }
    }

    override fun onBindViewHolder(holder: BaseHolder, position: Int) {

    }

}