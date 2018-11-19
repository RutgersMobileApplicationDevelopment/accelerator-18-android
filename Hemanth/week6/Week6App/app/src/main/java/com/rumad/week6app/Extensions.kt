package com.rumad.week6app

import android.content.Context
import android.widget.Toast

fun Context.showToast(title : String) {
    Toast.makeText(this, title, Toast.LENGTH_LONG).show()
}