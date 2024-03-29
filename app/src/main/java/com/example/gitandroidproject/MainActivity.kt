package com.example.gitandroidproject

import android.content.Intent
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

    fun toast (view: View) {
        val myToast = Toast.makeText(this, "Hello world!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun count (view: View) {
        val textView = findViewById<TextView>(R.id.textView)
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }

    fun random (view: View) {
        val randomIntent = Intent(this,SecondActivity:: class.java)
        val textView = findViewById<TextView>(R.id.textView)
        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT,count)
        startActivity(randomIntent)
    }
}