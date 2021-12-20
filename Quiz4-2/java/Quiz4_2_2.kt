package com.example.chapter4_quiz

import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter4_quiz.databinding.Quiz422Binding

class Quiz4_2_2 : AppCompatActivity() {
    val binding by lazy { Quiz422Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var listener = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                when(buttonView.id) {
                    R.id.checkCoconut -> Log.d("CheckBox", "코코넛")
                    R.id.checkDate -> Log.d("CheckBox", "대추야자")
                    R.id.checkOlive -> Log.d("CheckBox", "올리브")
                }
            }
        }
    }
}