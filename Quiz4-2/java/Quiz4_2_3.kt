package com.example.chapter4_quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter4_quiz.databinding.Quiz423Binding
import kotlin.concurrent.thread

class Quiz4_2_3 : AppCompatActivity() {
    val binding by lazy { Quiz423Binding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        thread(start = true) {
            for(i in 0..100) {
                Thread.sleep(1000)
                runOnUiThread {
                    binding.textNumber.text = "${i+1}"
                }
            }
        }
    }
}