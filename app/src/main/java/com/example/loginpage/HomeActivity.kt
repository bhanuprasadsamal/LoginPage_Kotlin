package com.example.loginpage
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val username = intent.getStringExtra("username")


        val welcomeTextView: TextView = findViewById(R.id.welcomeTextView)

        // Set the welcome message with the username
        welcomeTextView.text = "Welcome, $username!"
    }
}


