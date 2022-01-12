package com.example.a4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            val A = b.text.toString().toInt()
            val Aa = a.text.toString().toInt()
            val Sum = A+Aa
            a2.setText("$Sum")
            a1.setText("+")
        }

        button2.setOnClickListener {
            val A = b.text.toString().toInt()
            val Aa = a.text.toString().toInt()
            val Sum = A-Aa
            a2.setText("$Sum")
            a1.setText("-")
        }

        button3.setOnClickListener {
            val A = b.text.toString().toInt()
            val Aa = a.text.toString().toInt()
            val Sum = A*Aa
            a2.setText("$Sum")
            a1.setText("*")
        }

        button4.setOnClickListener {
            val A = b.text.toString().toInt()
            val Aa = a.text.toString().toInt()
            val Sum = A/Aa
            a2.setText("$Sum")
            a1.setText("/")
        }

        button5.setOnClickListener {
            val A = b.text.toString().toInt()
            val Aa = a.text.toString().toInt()
            val Sum = A%Aa
            a2.setText("$Sum")
            a1.setText("%")

        }

        button6.setOnClickListener {
            b.setText("")
            a.setText("")
            a2.setText("")
            a1.setText("")
        }
    }
}