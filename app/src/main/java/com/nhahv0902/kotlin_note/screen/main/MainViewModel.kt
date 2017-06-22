package com.nhahv0902.kotlin_note.screen.main


/**
 * Exposes the data to be used in the Main screen.
 */

class MainViewModel : MainContract.ViewModel {


    private var mPresenter: MainContract.Presenter? = null

    override fun onStart() {
        mPresenter?.onStart()
    }

    override fun onStop() {
        mPresenter?.onStop()
    }

    override fun setPresenter(presenter: MainContract.Presenter) {
        mPresenter = presenter
    }

    override fun onStartNoteCreation() {

    }

    override fun onStartNotebook() {

    }

    override fun onStartSetting() {

    }
}
