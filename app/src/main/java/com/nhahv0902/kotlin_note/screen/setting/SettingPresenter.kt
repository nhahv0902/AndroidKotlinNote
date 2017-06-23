package com.nhahv0902.kotlin_note.screen.setting

/**
 * Listens to user actions from the UI ([SettingFragment]), retrieves the data and updates
 * the UI as required.
 */
class SettingPresenter(private val mViewModel: SettingContract.ViewModel) : SettingContract.Presenter {

    override fun onStart() {}

    override fun onStop() {}

    companion object {
        private val TAG = SettingPresenter::class.java.name
    }
}
