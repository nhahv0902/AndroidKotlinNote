package com.nhahv0902.kotlin_note.utils

import android.databinding.BindingAdapter
import android.graphics.Typeface
import android.support.design.widget.BottomNavigationView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.nhahv0902.kotlin_note.R
import com.nhahv0902.kotlin_note.screen.main.MainViewModel

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

@BindingAdapter("bottom_navigation")
fun bottomNavigation(view: BottomNavigationView, viewModel: MainViewModel) {
    view.setOnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_notebook -> {
                viewModel.onStartNotebook()
                return@setOnNavigationItemSelectedListener true
            }
            R.id.navigation_note_create -> {
                viewModel.onStartSetting()
            }
            else -> {
                return@setOnNavigationItemSelectedListener false
            }
        }
        false
    }
}