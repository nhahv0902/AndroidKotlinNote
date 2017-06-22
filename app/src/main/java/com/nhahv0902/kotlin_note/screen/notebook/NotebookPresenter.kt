package com.nhahv0902.kotlin_note.screen.notebook

/**
 * Listens to user actions from the UI ([NotebookFragment]), retrieves the data and updates
 * the UI as required.
 */
class NotebookPresenter(private val mViewModel: NotebookContract.ViewModel) : NotebookContract.Presenter {

    override fun onStart() {}

    override fun onStop() {}

    companion object {
        private val TAG = NotebookPresenter::class.java.name
    }
}
