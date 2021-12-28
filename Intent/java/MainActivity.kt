package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this, NewActivity::class.java)
        binding.btnStart.setOnClickListener { startActivity(intent) }
        intent.putExtra("from1", "hello Bundle")
        intent.putExtra("from2", 2021)
    }
}