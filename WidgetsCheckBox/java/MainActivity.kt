package com.example.widgetscheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.example.widgetscheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    //listener 함수
    var listener = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
        if (isChecked) {
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

        /*
        binding.checkAmericano.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) Log.d("CheckBox", "아메리카노가 선택되었습니다.")
            else Log.d("CheckBox","사과가 선택해제되었습니다.")
         */
        }
    }
}