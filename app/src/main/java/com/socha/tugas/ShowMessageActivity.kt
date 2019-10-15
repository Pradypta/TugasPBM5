package com.socha.tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        val message = intent.getStringExtra(THE_MESSAGE)
        val message2 = intent.getStringExtra(THE_MESSAGE2)

        val textView = findViewById<TextView>(R.id.textView2).apply {
            text = message
        }
        val textView2 = findViewById<TextView>(R.id.textView3).apply {
            text = message2
        }
    }
}
