package com.tc.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var total = 0
    var num1 = 0
    var num2 =0
    var firstInput = true
    var secondInput =false
    val textInputView = findViewById<TextView>(R.id.tvInputView)
    val cancelBtn = findViewById<Button>(R.id.cancelBtn)
    val plusMinusBtn = findViewById<Button>(R.id.plusMinusBtn)
    val divisble = findViewById<Button>(R.id.divisible)
    val divide = findViewById<Button>(R.id.divide)
    val seven = findViewById<Button>(R.id.seven)
    val eight = findViewById<Button>(R.id.eight)
    val nine = findViewById<Button>(R.id.nine)
    val multiply = findViewById<Button>(R.id.multiply)
    val four = findViewById<Button>(R.id.four)
    val five = findViewById<Button>(R.id.five)
    val six = findViewById<Button>(R.id.six)
    val subtraction = findViewById<Button>(R.id.minus)
    val one = findViewById<Button>(R.id.one)
    val two = findViewById<Button>(R.id.two)
    val three = findViewById<Button>(R.id.three)
    val plus = findViewById<Button>(R.id.plus)
    val decimal = findViewById<Button>(R.id.decimal)
    val zero = findViewById<Button>(R.id.zero)
    val remove = findViewById<Button>(R.id.remove)
    val equal = findViewById<Button>(R.id.equal)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        clickButtons()



    }

    fun clickButtons(){

        seven.setOnClickListener{
            total = 7
            textInputView.text = (7).toString()
        }
        eight.setOnClickListener{
            total = 8
            textInputView.text = (8).toString()
        }
        nine.setOnClickListener {
            total = 9
            textInputView.text = (9).toString()
        }
        one.setOnClickListener {
            total = 1
            textInputView.text =(1).toString()
        }
        two.setOnClickListener {
            total =2
            textInputView.text = (2).toString()
        }

        three.setOnClickListener {
            total= 3
            textInputView.text =(3).toString()
        }
        four.setOnClickListener {
            total = 4
            textInputView.text =(4).toString()

        }
        five.setOnClickListener {
            total =5
            textInputView.text = (5).toString()

        }

        six.setOnClickListener {
            total = 6
            textInputView.text =  (6).toString()
        }
        zero.setOnClickListener {
            total = 0
            textInputView.text = (0).toString()
        }
    }


}