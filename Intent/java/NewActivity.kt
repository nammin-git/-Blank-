package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {
    val binding by lazy { ActivityNewBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.to1.text = intent.getStringExtra("from1")
        binding.to2.text = ${intent.getIntExtra("from2", 0)}
    }
}