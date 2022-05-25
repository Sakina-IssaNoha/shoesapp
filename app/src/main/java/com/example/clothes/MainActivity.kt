package com.example.clothes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnboots: Button
    lateinit var btnheels: Button
    lateinit var btnsneakers: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnboots = findViewById(R.id.btnboots)
        btnboots.setOnClickListener {
            val intent = Intent(this, boots::class.java )
            startActivity(intent)
        }

        btnheels = findViewById(R.id.btnheels)
        btnheels.setOnClickListener {
            val intent = Intent(this,heels::class.java)
            startActivity(intent)
        }

        btnsneakers = findViewById(R.id.btnsneakers)
        btnsneakers.setOnClickListener {
            val intent = Intent(this,sneakers::class.java)
            startActivity(intent)
        }
    }
}