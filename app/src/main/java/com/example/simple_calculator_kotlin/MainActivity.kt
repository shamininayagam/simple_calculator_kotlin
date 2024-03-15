package com.example.simple_calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addingtwonumbers()
    }

    fun addingtwonumbers()
    {
        var num1= findViewById<EditText>(R.id.number1)
        var num2= findViewById<EditText>(R.id.number2)
        var button1=findViewById<Button>(R.id.add_it)
        var button2=findViewById<Button>(R.id.sub_it)
        var button3=findViewById<Button>(R.id.mul_it)
        var button4=findViewById<Button>(R.id.div_it)
        var clearbutton=findViewById<Button>(R.id.clearbutton)
        var res=findViewById<TextView>(R.id.results)



        button1.setOnClickListener {

            var addnum1=num1.text.toString().toInt()
            var addnum2=num2.text.toString().toInt()
            var result=addnum1 + addnum2
            res.text= "RESULT: $result"

        }
        button2.setOnClickListener {

            var addnum1=num1.text.toString().toInt()
            var addnum2=num2.text.toString().toInt()
            var result=addnum1 - addnum2

            res.text= "RESULT: $result"
        }

        button3.setOnClickListener {

            var addnum1=num1.text.toString().toInt()
            var addnum2=num2.text.toString().toInt()
            var result=addnum1 * addnum2

            res.text= "RESULT: $result"
        }
        button4.setOnClickListener {

            var addnum1=num1.text.toString().toInt()
            var addnum2=num2.text.toString().toInt()
            var result=addnum1 / addnum2

            res.text= "RESULT: $result"

        }
        clearbutton.setOnClickListener {
            num1.setText("");
            num2.setText("");
        }

    }
}