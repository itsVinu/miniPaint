package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myCanavasView = MyCanavasView(this)
        myCanavasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        myCanavasView.contentDescription = getString(R.string.canavasContetDescription)
        setContentView(myCanavasView)
    }
}
