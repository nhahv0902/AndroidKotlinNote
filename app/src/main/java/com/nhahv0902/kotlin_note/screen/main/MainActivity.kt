package com.nhahv0902.kotlin_note.screen.main

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle

import com.nhahv0902.kotlin_note.R
import com.nhahv0902.kotlin_note.databinding.ActivityMainBinding
import com.nhahv0902.kotlin_note.screen.BaseActivity

/**
 * Main Screen.
 */
class MainActivity : BaseActivity() {

    private var mViewModel: MainContract.ViewModel? = null

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewModel = MainViewModel(this)

        val presenter = MainPresenter(mViewModel as MainViewModel)
        mViewModel?.setPresenter(presenter)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = mViewModel as MainViewModel?
    }

    override fun onStart() {
        super.onStart()
        mViewModel?.onStart()
    }

    override fun onStop() {
        mViewModel?.onStop()
        super.onStop()
    }
}
