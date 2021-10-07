package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.ele1)
        val imageview = findViewById<ImageView>(R.id.backImage)
        textview.setOnClickListener {
            textview.setText(" Please don't touch \nhere ")
            imageview.setImageResource(R.drawable.rakool)
            textview.setOnClickListener {
                val toast = Toast.makeText(this,"Please don't do this.",Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}