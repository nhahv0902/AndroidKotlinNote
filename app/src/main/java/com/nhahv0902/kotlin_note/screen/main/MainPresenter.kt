package com.nhahv0902.kotlin_note.screen.main

/**
 * Listens to user actions from the UI ([MainActivity]), retrieves the data and updates
 * the UI as required.
 */
class MainPresenter(private val mViewModel: MainContract.ViewModel) : MainContract.Presenter {

    override fun onStart() {}

    override fun onStop() {}

    companion object {
        private val TAG = MainPresenter::class.java.name
    }
}
