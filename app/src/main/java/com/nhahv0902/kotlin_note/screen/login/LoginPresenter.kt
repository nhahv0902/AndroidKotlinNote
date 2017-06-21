package com.nhahv0902.kotlin_note.screen.login

/**
 * Listens to user actions from the UI ([LoginActivity]), retrieves the data and updates
 * the UI as required.
 */
class LoginPresenter(private val viewModel: LoginContract.ViewModel) : LoginContract.Presenter {

    override fun onStart() {}

    override fun onStop() {}

    companion object {
        private val TAG = LoginPresenter::class.java.name
    }
}
