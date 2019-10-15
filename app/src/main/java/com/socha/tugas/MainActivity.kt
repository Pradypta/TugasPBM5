package com.socha.tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val THE_MESSAGE = "com.socha.tugas.MESSAGE"
const val THE_MESSAGE2 = "com.socha.tugas.MESSAGE2"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {

        val editText = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val message = editText.text.toString()
        val message2 = editText2.text.toString()

        val intent = Intent(this, ShowMessageActivity::class.java).apply {
            putExtra(THE_MESSAGE,message)
            this.putExtra(THE_MESSAGE2,message2)
        }
        startActivity(intent)
    }


}

