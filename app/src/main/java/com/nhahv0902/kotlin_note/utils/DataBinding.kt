package com.nhahv0902.kotlin_note.utils

import android.databinding.BindingAdapter
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by nhahv0902 on 6/22/17.
 * <>
 */

@BindingAdapter("fonts")
fun fonts(view: TextView, fonts: String) {
    view.typeface = Typeface.createFromAsset(view.context.assets, fonts)
}

@BindingAdapter("layout_margin")
fun layoutMargin(view: View, float: Float) {
    val layoutParams: ViewGroup.MarginLayoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
    layoutParams.topMargin = float.toInt()
    view.layoutParams = layoutParams
}