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
    lateinit var butBack:Button
    lateinit var butDot:Button
    lateinit var butPlus:Button
    lateinit var textResult:TextView

    var operando:Double=0.0
    var resultado:Double= 0.0
    var operador:String=""
    var preBorrar:Boolean=false

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
        butNu7=findViewById(R.id.butNu7)
        butNu8=findViewById(R.id.butNu8)
        butNu9=findViewById(R.id.butNu9)
        butDot=findViewById(R.id.butDot)
        butBack=findViewById(R.id.butBack)
        butPlus=findViewById(R.id.butPlus)

        butNu0.setOnClickListener {addDigit('0')}
        butNu1.setOnClickListener {addDigit('1')}
        butNu2.setOnClickListener {addDigit('2')}
        butNu3.setOnClickListener {addDigit('3')}
        butNu4.setOnClickListener {addDigit('4')}
        butNu5.setOnClickListener {addDigit('5')}
        butNu6.setOnClickListener {addDigit('6')}
        butNu7.setOnClickListener {addDigit('7')}
        butNu8.setOnClickListener {addDigit('8')}
        butNu9.setOnClickListener {addDigit('9')}
        butDot.setOnClickListener {addDigit('.')}
        butBack.setOnClickListener {delDigit()}
        butBack.setOnClickListener {delDigit()}
        butPlus.setOnClickListener {operar("+")}
        }
    private fun addDigit(c: Char) {
        // Si el digito es punto decimal y no se ha escrito nada mantener el 0.
        if (textResult.text=="0" && c!='.') {
            textResult.text=c.toString()
        } else {
            textResult.text=textResult.text.toString()+c.toString()
        }
    }

    private fun delDigit() {
        var long=textResult.length()
        if (long<2){
            //Si borra último dígito poner 0
            textResult.text="0"
        } else {
            textResult.text=textResult.text.subSequence(0..(long-2))
        }
    }

    private fun operar(op:String){
        // TODO: Arreglar funcionamiento de suma
        // Todo: mejor organización del código
        if (operador=="") {
            operando= textResult.text.toString().toDouble()
            textResult.text="0"
            operador=op
        } else {
            when (operador){
                "+" -> {resultado = operando+textResult.text.toString().toDouble()
                    textResult.text=resultado.toString() }
                "-" -> {resultado = operando-textResult.text.toString().toDouble()
                    textResult.text=resultado.toString() }
                "/" -> {resultado = operando/textResult.text.toString().toDouble()
                    textResult.text=resultado.toString() }
                "*" -> {resultado = operando*textResult.text.toString().toDouble()
                    textResult.text=resultado.toString() }
                else -> {return}
            }
            operador=op
            operando=resultado
            preBorrar=true
        }
    }

    private fun iniciar (){
        operando=0.0
        resultado= 0.0
        operador=""
        textResult.text="0"
        preBorrar=false
    }
}
