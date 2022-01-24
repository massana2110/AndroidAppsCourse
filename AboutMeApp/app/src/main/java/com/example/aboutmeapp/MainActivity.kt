package com.example.aboutmeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doneButton: Button = findViewById(R.id.done_button)

        doneButton.setOnClickListener { btn ->
            addNickname(btn)
        }
    }

    private fun addNickname(view: View) {
        val editText: EditText = findViewById(R.id.nickname_edit)
        val nicknameTextView: TextView = findViewById(R.id.nickname_text)

        nicknameTextView.text = editText.text

        editText.visibility = View.GONE

        view.visibility = View.GONE

        nicknameTextView.visibility = View.VISIBLE
    }
}