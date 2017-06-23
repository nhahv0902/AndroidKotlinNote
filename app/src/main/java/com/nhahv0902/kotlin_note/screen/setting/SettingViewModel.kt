package com.nhahv0902.kotlin_note.screen.setting


/**
 * Exposes the data to be used in the Setting screen.
 */

class SettingViewModel : SettingContract.ViewModel {

    private var mPresenter: SettingContract.Presenter? = null

    override fun onStart() {
        mPresenter?.onStart()
    }

    override fun onStop() {
        mPresenter?.onStop()
    }

    override fun setPresenter(presenter: SettingContract.Presenter) {
        mPresenter = presenter
    }
}
