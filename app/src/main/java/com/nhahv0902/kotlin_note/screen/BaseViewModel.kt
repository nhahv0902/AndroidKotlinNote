package com.nhahv0902.kotlin_note.screen


/**
 * Created by Hoang Van Nha on 5/21/2017.
 * <.
 */
interface BaseViewModel<in T : BasePresenter> {
    fun onStart()
    fun onStop()
    fun setPresenter(presenter: T)
}