package com.nhahv0902.kotlin_note.screen.notebook


/**
 * Exposes the data to be used in the Notebook screen.
 */

class NotebookViewModel : NotebookContract.ViewModel {

    private var mPresenter: NotebookContract.Presenter? = null

    override fun onStart() {
        mPresenter?.onStart()
    }

    override fun onStop() {
        mPresenter?.onStop()
    }

    override fun setPresenter(presenter: NotebookContract.Presenter) {
        mPresenter = presenter
    }
}
