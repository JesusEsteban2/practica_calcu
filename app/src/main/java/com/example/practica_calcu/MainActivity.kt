package com.example.practica_calcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var butNu0
    lateinit var butNu1
    lateinit var butNu2
    lateinit var butNu3
    lateinit var butNu4
    lateinit var butNu5
    lateinit var butNu6
    lateinit var butNu7
    lateinit var butNu8
    lateinit var textResult

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        butNu0=findViewById(R.id.butNu0)
        butNu1=findViewById(R.id.butNu1)
        butNu2=findViewById(R.id.butNu2)


    }
}