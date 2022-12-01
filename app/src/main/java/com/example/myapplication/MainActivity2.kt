package com.example.myapplication

import android.content.Intent
import android.icu.text.Edits
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val TEXT1 = intent.getStringExtra("TEXT1")
        val editText = findViewById<EditText>(R.id.editText)
        val buttonPanel = findViewById<Button>(R.id.buttonPanel)
        buttonPanel.setOnClickListener {
            intent = Intent(applicationContext, MainActivity3::class.java)
            intent.putExtra("TEXT1", TEXT1)
            intent.putExtra("TEXT2",editText.text.toString())
            startActivity(intent)
        }
    }
}