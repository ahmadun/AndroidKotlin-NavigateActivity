package com.example.praktikum7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnClick1=findViewById<Button>(R.id.btnClick)
        btnClick1.setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}