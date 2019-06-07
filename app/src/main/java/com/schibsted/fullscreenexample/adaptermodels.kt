package com.schibsted.fullscreenexample

sealed class RecyclerViewItem

class AdItem : RecyclerViewItem()

class RegularItem : RecyclerViewItem()