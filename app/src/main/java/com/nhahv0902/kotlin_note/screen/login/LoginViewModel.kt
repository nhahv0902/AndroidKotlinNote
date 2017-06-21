package com.nhahv0902.kotlin_note.screen.login


/**
 * Exposes the data to be used in the Login screen.
 */

class LoginViewModel : LoginContract.ViewModel {

    private var mPresenter: LoginContract.Presenter? = null

    override fun onStart() {
        mPresenter?.onStart()
    }

    override fun onStop() {
        mPresenter?.onStop()
    }

    override fun setPresenter(presenter: LoginContract.Presenter) {
        mPresenter = presenter
    }

    init {

    }
}
