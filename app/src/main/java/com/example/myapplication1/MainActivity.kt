package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var one = true
        val button2: Button = findViewById(R.id.button2)
        val textView: TextView = findViewById(R.id.textView)
        val layout: ConstraintLayout = findViewById(R.id.mane)

        button2.setOnClickListener {
            // listener

            Toast.makeText(this,"button is working", Toast.LENGTH_SHORT).show()
            textView.text = "now it has changed"
            if(one) {
                layout.setBackgroundColor(Color.BLUE)
                one = false
            }else {
                layout.setBackgroundColor(Color.WHITE)
                one = true
            }

        }
    }
}