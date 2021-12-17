package com.example.widgetsratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widgetsratingbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            binding.textView.text = "${rating}"

            ratingBar.stepSize = 0.1F
        }
    }
}