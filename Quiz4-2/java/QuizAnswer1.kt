package com.example.chapter4_quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter4_quiz.databinding.Quiz421Binding

class QuizAnswer1 : AppCompatActivity() {
    val binding by lazy { Quiz421Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { buttonView, isChecked ->
            when(buttonView.id) {
                R.id.radioApple -> binding.textView.text = "Apple"
                R.id.radioBanana -> binding.textView.text = "Banana"
                R.id.radioOrange -> binding.textView.text = "Orange"
            }
        }
    }
}
