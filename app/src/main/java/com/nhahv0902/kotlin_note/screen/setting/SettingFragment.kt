package com.nhahv0902.kotlin_note.screen.setting

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nhahv0902.kotlin_note.R
import com.nhahv0902.kotlin_note.databinding.FragmentSettingBinding
import com.nhahv0902.kotlin_note.screen.BaseFragment

/**
 * Setting Screen.
 */
class SettingFragment : BaseFragment() {

    private var mViewModel: SettingContract.ViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = SettingViewModel()

        val presenter = SettingPresenter(mViewModel as SettingViewModel)
        mViewModel?.setPresenter(presenter)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val binding: FragmentSettingBinding = DataBindingUtil.inflate(inflater!!, R.layout.fragment_setting, container, false)
        binding.viewModel = mViewModel as SettingViewModel?
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        mViewModel?.onStart()
    }

    override fun onStop() {
        mViewModel?.onStop()
        super.onStop()
    }

    companion object {

        fun newInstance(): SettingFragment {
            return SettingFragment()
        }
    }
}
