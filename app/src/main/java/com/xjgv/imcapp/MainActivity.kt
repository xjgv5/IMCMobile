package com.xjgv.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val editTxt = findViewById<AppCompatEditText>(R.id.edtText)

        btnStart.setOnClickListener {
            val name = editTxt.text.toString()

            if (name.isNullOrEmpty()){
                Log.i("xjgv","Boton presionado")
            }
        }
    }
}