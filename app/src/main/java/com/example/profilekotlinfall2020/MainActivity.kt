package com.example.profilekotlinfall2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnProfile = findViewById<Button>(R.id.idbtnViewProfile)// as Button
        btnProfile.setOnClickListener {
            var intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }

    }
}
