package com.schibsted.fullscreenexample

import androidx.recyclerview.widget.DiffUtil

object ItemDiffCallback : DiffUtil.ItemCallback<RecyclerViewItem>() {

    override fun areItemsTheSame(oldItem: RecyclerViewItem, newItem: RecyclerViewItem): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: RecyclerViewItem, newItem: RecyclerViewItem): Boolean {
        return true
    }
}