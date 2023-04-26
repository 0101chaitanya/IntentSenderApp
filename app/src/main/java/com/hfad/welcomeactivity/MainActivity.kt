package com.hfad.welcomeactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val FULL_NAME_KEY = "FULL_NAME_KEY"

class MainActivity : AppCompatActivity() {
    private lateinit var fullName: EditText
    private lateinit var submitButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton = findViewById(R.id.submit_button)
        fullName = findViewById(R.id.full_name)
        submitButton.setOnClickListener {
            val text = fullName.text.toString().trim()
            if (text.isNotEmpty()) {
                val intent = Intent(this, WelcomeActivity::class.java)
                intent.putExtra(FULL_NAME_KEY, text)
                startActivity(intent)
            } else {
                Toast.makeText(this, getString(R.string.full_name_label), Toast.LENGTH_SHORT).show()
            }
        }
    }
}