package com.mason.l1_prog7313

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        // Find buttons by their IDs
        val btnCalculator = findViewById<Button>(R.id.button3)
        val btnComingSoon = findViewById<Button>(R.id.button4)

        // Navigate to CalculatorActivity
        btnCalculator.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Show "Coming Soon!" toast
        btnComingSoon.setOnClickListener {
            Toast.makeText(this, "Coming Soon!", Toast.LENGTH_SHORT).show()
        }
    }
}
