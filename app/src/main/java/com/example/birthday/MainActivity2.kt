package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.textview

class MainActivity2 : AppCompatActivity() {

    companion object{
        const val Name_Extra="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name=intent.getStringExtra(Name_Extra)

        textview.text= "Happy Birthday\n$name\nI wish\nyou live longer"

    }
}