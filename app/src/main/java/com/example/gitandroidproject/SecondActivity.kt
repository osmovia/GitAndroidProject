package com.example.gitandroidproject

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total count"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber () {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random
        var randomInt = 0

        if(count > 0) {
            randomInt = random.nextInt(count +1)
        }
        findViewById<TextView>(R.id.textViewRandom).text = randomInt.toString()

        findViewById<TextView>(R.id.textViewLabel).text = getString(R.string.random_heading, count)

    }
}