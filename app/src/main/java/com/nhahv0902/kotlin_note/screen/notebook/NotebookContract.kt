package com.nhahv0902.kotlin_note.screen.notebook

import com.nhahv0902.kotlin_note.screen.BasePresenter
import com.nhahv0902.kotlin_note.screen.BaseViewModel

/**
 * This specifies the contract between the view and the presenter.
 */
interface NotebookContract {
    /**
     * View.
     */
    interface ViewModel : BaseViewModel<Presenter>

    /**
     * Presenter.
     */
    interface Presenter : BasePresenter
}
