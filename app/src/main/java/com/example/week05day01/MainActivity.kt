package com.example.week05day01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
    }

    private fun connectViews() {
        textView = findViewById(R.id.text_view_activity_main)
    }
}