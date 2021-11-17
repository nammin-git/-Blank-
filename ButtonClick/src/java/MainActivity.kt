package com.example.buttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.buttonclick.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    //이게 무슨 뜻이고

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //왜 바꾸노
        setContentView(binding.root)

        binding.btnSay.setOnClickListener {
            binding.textSay.text = "Hello Kotlin!!"
        }

    }
}