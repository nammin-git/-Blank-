package com.example.blog_bulletin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setting = R.id.setting

        setting.setOnClickListener {
            Toast.makeText(this,"Hello World!", Toast.LENGTH_SHORT).show()
        }
    }
}