package com.example.blog_bulletin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.blog_bulletin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var button : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = button.root
        setContentView(view)

        button.setting.setOnClickListener {
            print("설정 버튼 입니다.")
        }
    }
}