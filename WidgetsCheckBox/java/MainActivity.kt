package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.example.checkbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //viewBinding을 위한 binding object
    lateinit var binding: ActivityMainBinding

    //listener을 블록 형태로 사용하지 않고 분리
    var listener = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
        if(isChecked) {
            when (buttonView.id) {
                R.id.checkAmericano -> Log.d("CheckBox", "아메리카노가 선택되었습니다.")
                R.id.checkCappucino -> Log.d("CheckBox", "카푸치노가 선택되었습니다.")
                R.id.checkLatte -> Log.d("CheckBox", "라테가 선택되었습니다.")
                R.id.checkSmoothie -> Log.d("CheckBox", "스무디가 선택되었습니다.")
            }
        }
        else {
            when (buttonView.id) {
                R.id.checkAmericano -> Log.d("CheckBox", "아메리카노가 선택 해제되었습니다.")
                R.id.checkCappucino -> Log.d("CheckBox", "카푸치노가 선택 해제되었습니다.")
                R.id.checkLatte -> Log.d("CheckBox", "라테가 선택 해제되었습니다.")
                R.id.checkSmoothie -> Log.d("CheckBox", "스무디가 선택 해제되었습니다.")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkAmericano.setOnCheckedChangeListener(listener)
        binding.checkCappucino.setOnCheckedChangeListener(listener)
        binding.checkLatte.setOnCheckedChangeListener(listener)
        binding.checkSmoothie.setOnCheckedChangeListener(listener)
    }
}