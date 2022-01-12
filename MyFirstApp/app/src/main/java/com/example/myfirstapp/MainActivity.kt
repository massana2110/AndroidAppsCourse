package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.count_up_button)
        val resultText: TextView = findViewById(R.id.result_text)
        val resetButton: Button = findViewById(R.id.reset_button)

        rollButton.setOnClickListener { rollDice(resultText) }
        countUpButton.setOnClickListener { addOneToDice(resultText) }
        resetButton.setOnClickListener { resetButton(resultText) }
    }

    private fun rollDice(resultText: TextView) {
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    // Coding Challenge:
    // https://developer.android.com/codelabs/kotlin-android-training-app-anatomy#6
    private fun addOneToDice(resultText: TextView) {

        when (val actualValue = resultText.text.toString()) {
            getString(R.string.message) -> resultText.text = "1"
            "6" -> return
            else -> {
                resultText.text = (actualValue.toInt() + 1).toString()
            }
        }
    }

    private fun resetButton(resultText: TextView) {
        resultText.text = getString(R.string.message)
    }
}