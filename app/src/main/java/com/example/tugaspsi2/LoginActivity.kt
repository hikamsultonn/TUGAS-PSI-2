package com.example.tugaspsi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val imageBack2 = findViewById<ImageView>(R.id.back2);
        val logLog = findViewById<Button>(R.id.btnLogin2);
        val regisLog = findViewById<TextView>(R.id.regLog);

        imageBack2.setOnClickListener {
            val Intent = Intent(this, RegisterActivity::class.java)
            startActivity(Intent)
        }
        logLog.setOnClickListener {
            val Intent = Intent(this, DashboardActivity::class.java)
            startActivity(Intent)
            Toast.makeText(applicationContext, "YOU ARE SUCCES LOGIN", Toast.LENGTH_LONG).show()
            true
        }
        regisLog.setOnClickListener {
            val Intent = Intent(this, RegisterActivity::class.java)
            startActivity(Intent)
        }
    }
}