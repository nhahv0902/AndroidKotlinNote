package com.nhahv0902.kotlin_note.screen.setting

import com.nhahv0902.kotlin_note.screen.BasePresenter
import com.nhahv0902.kotlin_note.screen.BaseViewModel

/**
 * This specifies the contract between the view and the presenter.
 */
interface SettingContract {
    /**
     * View.
     */
    interface ViewModel : BaseViewModel<Presenter>

    /**
     * Presenter.
     */
    interface Presenter : BasePresenter
}
