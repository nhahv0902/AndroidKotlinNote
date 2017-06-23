package com.nhahv0902.kotlin_note.screen.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by nhahv0902 on 6/23/17.
 * <>
 */
class ViewPagerAdapter(fragmentManager: FragmentManager, fragments: MutableList<Fragment>) : FragmentPagerAdapter(fragmentManager) {

    private val mFragment = fragments

    override fun getItem(position: Int): Fragment {
        return mFragment[position]
    }

    override fun getCount(): Int {
        return mFragment.size
    }
}