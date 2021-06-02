package com.example.gitandroidproject

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe (view: View) {
        val myToast = Toast.makeText(this, "Hello world!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun countMe(view: View) {
        val countString = findViewById<TextView>(R.id.textView).text.toString()
        var count: Int = countString.toInt()
        count++

        findViewById<TextView>(R.id.textView).text = count.toString()
    }
}