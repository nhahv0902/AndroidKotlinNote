package com.nhahv0902.kotlin_note.screen.login

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.nhahv0902.kotlin_note.R
import com.nhahv0902.kotlin_note.databinding.ActivityLoginBinding
import com.nhahv0902.kotlin_note.screen.BaseActivity

/**
 * Login Screen.
 */
class LoginActivity : BaseActivity() {

    private var mViewModel: LoginContract.ViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = LoginViewModel()

        val presenter = LoginPresenter(mViewModel as LoginViewModel)
        mViewModel?.setPresenter(presenter)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.viewModel = mViewModel as LoginViewModel?
    }

    override fun onStart() {
        super.onStart()
        mViewModel?.onStart()
    }

    override fun onStop() {
        mViewModel?.onStop()
        super.onStop()
    }
}
