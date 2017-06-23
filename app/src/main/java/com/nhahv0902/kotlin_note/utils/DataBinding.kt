package com.nhahv0902.kotlin_note.utils

import android.databinding.BindingAdapter
import android.graphics.Typeface
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
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

@BindingAdapter("bottom_navigation", "view_pager")
fun bottomNavigation(view: BottomNavigationView, viewModel: MainViewModel, viewPager: ViewPager) {
    view.setOnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_notebook -> {
                viewModel.onStartNotebook()
                viewPager.currentItem = 0
            }
            R.id.navigation_note_create -> {
                viewModel.onStartNoteCreation()
            }
            R.id.navigation_setting -> {
                viewPager.currentItem = 1
            }
            else -> {
                return@setOnNavigationItemSelectedListener false
            }
        }
        true
    }

    viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {}

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

        override fun onPageSelected(position: Int) {
            view.selectedItemId = if (position == 0) R.id.navigation_notebook else R.id.navigation_setting
        }
    })
}
