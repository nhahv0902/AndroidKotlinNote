package com.nhahv0902.kotlin_note.widget

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.ProgressBar

/**
 * Created by nhahv0902 on 6/21/17.
 * <>
 */
class NoteProgressDialog(context: Context) : ProgressDialog(context) {

    override fun show() {
        super.show()
        window?.let {
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }
        setContentView(ProgressBar(context))
    }
}