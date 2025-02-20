package com.mason.l1_prog7313

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize views
        val editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        // Buttons
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)

        // Function to get numbers safely
        fun getNumbers(): Pair<Int, Int>? {
            val number1 = editTextNumber1.text.toString().toIntOrNull()
            val number2 = editTextNumber2.text.toString().toIntOrNull()

            if (number1 == null || number2 == null) {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
                return null
            }
            return Pair(number1, number2)
        }

        // Addition
        buttonAdd.setOnClickListener {
            getNumbers()?.let { (num1, num2) ->
                val result = num1 + num2
                resultTextView.text = "Result: $result"
            }
        }

        // Subtraction
        buttonSubtract.setOnClickListener {
            getNumbers()?.let { (num1, num2) ->
                val result = num1 - num2
                resultTextView.text = "Result: $result"
            }
        }

        // Multiplication
        buttonMultiply.setOnClickListener {
            getNumbers()?.let { (num1, num2) ->
                val result = num1 * num2
                resultTextView.text = "Result: $result"
            }
        }

        // Division
        buttonDivide.setOnClickListener {
            getNumbers()?.let { (num1, num2) ->
                if (num2 == 0) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                } else {
                    val result = num1.toDouble() / num2.toDouble()
                    resultTextView.text = "Result: $result"
                }
            }
        }
    }
}
