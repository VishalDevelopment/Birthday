package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.text1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun button(view: View) {
        var name = text1.editableText.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(MainActivity2.Name_Extra,name)
        startActivity(intent)

    }
}