package com.nhahv0902.kotlin_note.screen.main

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.support.v4.app.Fragment
import com.android.databinding.library.baseAdapters.BR
import com.nhahv0902.kotlin_note.screen.notebook.NotebookFragment
import com.nhahv0902.kotlin_note.screen.setting.SettingFragment


/**
 * Exposes the data to be used in the Main screen.
 */

class MainViewModel(activity: MainActivity) : BaseObservable(), MainContract.ViewModel {

    private val mActivity = activity
    private var mPresenter: MainContract.Presenter? = null
    private val mFragments: MutableList<Fragment> = ArrayList()

    @get: Bindable
    var mAdapter: ViewPagerAdapter? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.mAdapter)
        }

    override fun onStart() {
        mPresenter?.onStart()
    }

    override fun onStop() {
        mPresenter?.onStop()
    }

    override fun setPresenter(presenter: MainContract.Presenter) {
        mPresenter = presenter
    }

    init {
        mFragments.add(NotebookFragment.newInstance())
        mFragments.add(SettingFragment.newInstance())
        mAdapter = ViewPagerAdapter(mActivity.supportFragmentManager, mFragments)
    }

    override fun onStartNoteCreation() {

    }

    override fun onStartNotebook() {

    }

    override fun onStartSetting() {

    }
}
