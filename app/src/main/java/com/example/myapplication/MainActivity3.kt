package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val TEXT1 = intent.getStringExtra("TEXT1")
        val TEXT2 = intent.getStringExtra("TEXT2")
        textView1.text = TEXT1
        textView2.text = TEXT2

    }
}