package com.example.chapter4_quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter4_quiz.databinding.Quiz422Binding

class QuizAnswer2: AppCompatActivity() {
    val binding by lazy{ Quiz422Binding.inflate(layoutInflater) }
    var apple = false
    var banana = false
    var orange = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.checkApple.setOnCheckedChangeListener { buttonView, isChecked ->
            apple = isChecked
            printCheckedItems()
        }

        binding.checkBanana.setOnCheckedChangeListener { buttonView, isChecked ->
            banana= isChecked
            printCheckedItems()
        }

        binding.checkOrange.setOnCheckedChangeListener { buttonView, isChecked ->
            orange = isChecked
            printCheckedItems()
        }
    }

    fun printCheckedItems() {
        var result = ""
        if(apple) result = "사과"

        if(banana) {
            if(result.isNotEmpty()) result += "와 "
            result += "바나나"
        }

        if(orange) {
            if(result.isNotEmpty()) result += "와 "
            result += "오렌지"
        }
        binding.textChoice.text = "${result}가 선택되었습니다."
    }
}