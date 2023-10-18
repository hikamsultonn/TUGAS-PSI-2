package com.example.tugaspsi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val tv1 = findViewById<TextView>(R.id.textViewDash2);

        tv1.setOnClickListener {
            Toast.makeText(applicationContext, "WAW KAMU BERHASIL MENEKAN TEXT", Toast.LENGTH_SHORT)
                .show()
            tv1.setText("Selamat Menikmati <3");
        }
    }
}