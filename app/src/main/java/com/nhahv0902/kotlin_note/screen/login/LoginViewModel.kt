package com.nhahv0902.kotlin_note.screen.login

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.os.Handler
import com.android.databinding.library.baseAdapters.BR
import com.nhahv0902.kotlin_note.screen.main.MainActivity
import com.nhahv0902.kotlin_note.utils.TimeUtil


/**
 * Exposes the data to be used in the Login screen.
 */

class LoginViewModel(activity: LoginActivity) : BaseObservable(), LoginContract.ViewModel {
    private val mActivity = activity

    private var mPresenter: LoginContract.Presenter? = null

    @get: Bindable
    var mIsLoginScreen: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.mIsLoginScreen)
        }

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
        start()
    }

    fun start() {
        Handler().postDelayed({
            mIsLoginScreen = true
            mActivity.animationVisibleLogin()
        }, TimeUtil.TIME_DELAY)
    }

    override fun onClickLoginFacebook() {
        mActivity.startActivity(MainActivity.newIntent(mActivity.applicationContext))
    }

    override fun onClickLoginGoogle() {
        mActivity.startActivity(MainActivity.newIntent(mActivity.applicationContext))
    }
}
