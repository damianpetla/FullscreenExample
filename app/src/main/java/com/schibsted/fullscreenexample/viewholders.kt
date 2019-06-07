package com.schibsted.fullscreenexample

import android.view.View
import androidx.recyclerview.widget.RecyclerView

sealed class BaseHolder(item: View) : RecyclerView.ViewHolder(item)

class NormalItemHolder(item: View) : BaseHolder(item)

class AdItemHolder(item: View) : BaseHolder(item) {

    private val adLabel = item.findViewById<View>(R.id.adlabel)
    private val adContent = item.findViewById<View>(R.id.adcontent)
    private val labelElevation = item.resources.getDimension(R.dimen.cardview_default_elevation)

    init {
        item.viewTreeObserver.addOnScrollChangedListener {
            val offset = -item.top.toFloat()
            adLabel.translationY = Math.max(offset, 0f)
            adLabel.translationZ = if (offset < 0) labelElevation else 0f
            adContent.translationY = offset
        }
    }
}