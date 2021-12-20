package com.example.chapter4_quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter4_quiz.databinding.Quiz421Binding

class Quiz4_2_1 : AppCompatActivity() {
    val binding by lazy { Quiz421Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioApple -> binding.textFruit.text = "사과"
                R.id.radioBanana -> binding.textFruit.text = "바나나"
                R.id.radioOrange -> binding.textFruit.text = "오렌지"
            }
        }
    }
}