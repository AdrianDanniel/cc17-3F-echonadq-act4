package com.example.tipcalculator

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


        val billAmountEditText = findViewById<EditText>(R.id.billAmountEditText)
        val tipPercentageEditText = findViewById<EditText>(R.id.tipPercentageEditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)


        calculateButton.setOnClickListener {

            val billAmountText = billAmountEditText.text.toString()
            val tipPercentageText = tipPercentageEditText.text.toString()


            if (billAmountText.isNotEmpty() && tipPercentageText.isNotEmpty()) {
                val billAmount = billAmountText.toDouble()
                val tipPercentage = tipPercentageText.toDouble()


                val tipAmount = billAmount * (tipPercentage / 100)


                resultTextView.text = "Tip Amount: $tipAmount"
            } else {

                Toast.makeText(this, "Please enter both values", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
