package com.example.practica_calcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var butNu0:Button
    lateinit var butNu1:Button
    lateinit var butNu2:Button
    lateinit var butNu3:Button
    lateinit var butNu4:Button
    lateinit var butNu5:Button
    lateinit var butNu6:Button
    lateinit var butNu7:Button
    lateinit var butNu8:Button
    lateinit var butNu9:Button
    lateinit var textResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textResult=findViewById(R.id.textResult)
        butNu0=findViewById(R.id.butNu0)
        butNu1=findViewById(R.id.butNu1)
        butNu2=findViewById(R.id.butNu2)
        butNu3=findViewById(R.id.butNu3)
        butNu4=findViewById(R.id.butNu4)
        butNu5=findViewById(R.id.butNu5)
        butNu6=findViewById(R.id.butNu6)
        butNu6=findViewById(R.id.butNu6)
        butNu6=findViewById(R.id.butNu6)
        butNu6=findViewById(R.id.butNu6)

        butNu1.setOnClickListener {addDigit('1')}


        }
    private fun addDigit(c: Char) {
        if (textResult.text=="0") {
            textResult.text=c.toString()
        } else {
            textResult.text=textResult.text.toString()+c.toString()
        }
    }
}
