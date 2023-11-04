package com.xjgv.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val txtvResult = findViewById<TextView>(R.id.txtvResult)

        val name:String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        txtvResult.text = "Hola $name"
    }
}