package com.example.backgroundcolorchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butCool = findViewById<Button>(R.id.butCool)
        val butHot = findViewById<Button>(R.id.butHot)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        butCool.setOnClickListener {
            linearLayout.setBackgroundColor(0xFF00FF00.toInt())
        }

        butHot.setOnClickListener {
            linearLayout.setBackgroundColor(0xFFFF0000.toInt())
        }

    }
}