package com.nhahv0902.kotlin_note.screen.main

import com.nhahv0902.kotlin_note.screen.BasePresenter
import com.nhahv0902.kotlin_note.screen.BaseViewModel

/**
 * This specifies the contract between the view and the presenter.
 */
interface MainContract {
    /**
     * View.
     */
    interface ViewModel : BaseViewModel<Presenter> {
        fun onStartNoteCreation()
        fun onStartNotebook()
        fun onStartSetting()
    }

    /**
     * Presenter.
     */
    interface Presenter : BasePresenter
}
