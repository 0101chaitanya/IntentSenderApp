package com.hfad.welcomeactivity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    private lateinit var welcomeTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val fullName = intent.getStringExtra(FULL_NAME_KEY)
        welcomeTextView = findViewById(R.id.welcome_text)
        welcomeTextView.text = getString(R.string.welcome_text, fullName)

    }
}