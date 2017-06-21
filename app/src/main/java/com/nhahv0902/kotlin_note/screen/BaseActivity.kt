package com.nhahv0902.kotlin_note.screen

import android.support.v7.app.AppCompatActivity
import com.nhahv0902.kotlin_note.widget.NoteProgressDialog

/**
 * Created by nhahv0902 on 6/21/17.
 * <>
 */
open class BaseActivity : AppCompatActivity() {
    private var mProgress: NoteProgressDialog? = null

    fun showProgress() {
        if (mProgress == null) {
            mProgress = NoteProgressDialog(this)
        }
        mProgress?.let {
            it.show()
        }
    }

    fun dismissProgress() {
        mProgress?.let {
            if (it.isShowing) {
                it.dismiss()
            }
        }
    }
}