package com.example.tugaspsi2

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLog1 =findViewById<Button>(R.id.btn1);
        val btnReg1 =findViewById<Button>(R.id.btn2);

        btnLog1.setOnClickListener {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
            Toast.makeText(applicationContext, "YOU ARE SUCCES IN PAGE LOGIN", Toast.LENGTH_SHORT).show()
            true
        }

        btnReg1.setOnClickListener {
            val Intent = Intent(this, RegisterActivity::class.java)
            startActivity(Intent)
            Toast.makeText(applicationContext, "YOU ARE SUCCES IN PAGE REGISTER", Toast.LENGTH_SHORT).show()
            true
        }

    }


}