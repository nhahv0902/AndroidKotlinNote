package com.nhahv0902.kotlin_note.screen.notebook

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nhahv0902.kotlin_note.R
import com.nhahv0902.kotlin_note.databinding.FragmentNotebookBinding
import com.nhahv0902.kotlin_note.screen.BaseFragment

/**
 * Notebook Screen.
 */
class NotebookFragment : BaseFragment() {

    private var mViewModel: NotebookContract.ViewModel? = null

    companion object {
        fun newInstance(): NotebookFragment {
            return NotebookFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = NotebookViewModel()

        val presenter = NotebookPresenter(mViewModel as NotebookViewModel)
        mViewModel?.setPresenter(presenter)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val binding: FragmentNotebookBinding = DataBindingUtil.inflate(inflater!!, R.layout.fragment_notebook, container, false)
        binding.viewModel = mViewModel as NotebookViewModel?
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


}
