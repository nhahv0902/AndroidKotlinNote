package com.nhahv0902.kotlin_note.screen.login

import android.databinding.DataBindingUtil
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.nhahv0902.kotlin_note.R
import com.nhahv0902.kotlin_note.databinding.ActivityLoginBinding
import com.nhahv0902.kotlin_note.screen.BaseActivity

/**
 * Login Screen.
 */
class LoginActivity : BaseActivity() {

    private var mViewModel: LoginContract.ViewModel? = null
    private var mBinding: ActivityLoginBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = LoginViewModel(this)

        val presenter = LoginPresenter(mViewModel as LoginViewModel)
        mViewModel?.setPresenter(presenter)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        mBinding?.viewModel = mViewModel as LoginViewModel?

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window?.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
    }

    override fun onStart() {
        super.onStart()
        mViewModel?.onStart()
    }

    override fun onStop() {
        mViewModel?.onStop()
        super.onStop()
    }

    fun animationVisibleLogin() {
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.translate_view_login)
        mBinding?.let {
            it.textWellCome.startAnimation(animation)
            it.linearButton.startAnimation(animation)
        }
    }
}
