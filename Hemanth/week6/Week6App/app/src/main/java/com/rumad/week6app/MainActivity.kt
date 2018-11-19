package com.rumad.week6app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUEST_OTHER = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val profile = Profile("John", "Doe")

            startActivityForResult(OtherActivity.getIntent(it.context, profile), REQUEST_OTHER)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode) {
            REQUEST_OTHER -> {
                when(resultCode) {
                    OtherActivity.RESULT_CLICKED -> {
                        showToast("Welcome back!. You clicked the button")
                    }

                    else -> {
                        showToast("Welcome back!")
                    }
                }
            }
        }
    }
}
