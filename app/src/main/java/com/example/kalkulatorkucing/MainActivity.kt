package com.example.kalkulatorkucing

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputUmur = findViewById<EditText>(R.id.inputUmur)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnHitung.setOnClickListener {
            val umurString = inputUmur.text.toString()

            if (umurString.isNotEmpty()) {
                val umurKucing = umurString.toInt()
                val umurManusia = umurKucing * 7

                tvHasil.text = "$umurManusia tahun umur manusia!"
            } else {
                tvHasil.text = "Mohon masukkan umur kucing terlebih dahulu!"
            }
        }
    }
}