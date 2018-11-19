package com.rumad.week6app

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {

    companion object {
        val EXTRA_PROFILE = "EXTRA_PROFILE"
        val RESULT_CLICKED = 1

        fun getIntent(c : Context, profile : Profile) : Intent {
            val intent = Intent(c, OtherActivity::class.java)

            intent.putExtra(EXTRA_PROFILE, profile)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        otherButton.text = (intent.getSerializableExtra(EXTRA_PROFILE) as Profile).firstName


        otherButton.setOnClickListener {
            setResult(RESULT_CLICKED)
            finish()
        }
    }
}
