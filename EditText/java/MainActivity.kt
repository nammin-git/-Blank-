package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.core.widget.addTextChangedListener
import com.example.edittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                //일반 출력
                //Log.d("EditText", "현재 입력된 값=${s.toString()}")

                //일정 글자수 이상부터 출력
                if (s.toString().length >= 8) {
                    Log.d("EditText", "8글자 이상일 때만 출력 = ${s.toString()}")
                }

            }
        })
    }
}