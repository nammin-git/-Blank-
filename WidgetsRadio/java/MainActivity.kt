package com.example.widgetscheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.widgetscheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkAmericano.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) Log.d("CheckBox", "아메리카노가 선택되었습니다.")
            else Log.d("CheckBox","사과가 선택해제되었습니다.")
        }
    }
}