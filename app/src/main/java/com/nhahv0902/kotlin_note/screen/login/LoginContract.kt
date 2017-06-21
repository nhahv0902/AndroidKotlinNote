package com.nhahv0902.kotlin_note.screen.login

import com.nhahv0902.kotlin_note.screen.BasePresenter
import com.nhahv0902.kotlin_note.screen.BaseViewModel

/**
 * This specifies the contract between the view and the presenter.
 */
interface LoginContract {
    /**
     * View.
     */
    interface ViewModel : BaseViewModel<Presenter> {
        fun onClickLoginFacebook()
        fun onClickLoginGoogle()
    }

    /**
     * Presenter.
     */
    interface Presenter : BasePresenter
}
