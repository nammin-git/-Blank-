package com.example.controlflowfor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //지정한 숫자 범위만큼 반복
        for(index in 1..10) {
            Log.d("For", "현재 숫자는 ${index}입니다.")
        }

        //종료값 이전까지만 반복
        var arrayMonth = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
        for(index in arrayMonth.indices) {
            Log.d("For", "현재 월은 ${arrayMonth.get(index)}")
        }

        //step
        for(index in 0..100 step 3) {
            Log.d("For", "건너뛰기 : ${index}")
        }

        //downTo
        for(index in 10 downTo 0) {
            Log.d("For", "감소시키기 : ${index}")
        }

        //건너뛰면서 감소시키기
        for(index in 10 downTo 0 step 2) {
            Log.d("For", "건너뛰면서 감소시키기 : ${index}")
        }

        //배열 또는 컬렉션에 들어 있는 엘리먼트 반복
        for(month in arrayMonth) {
            Log.d("For", "현재 월은 ${month}입니다.")
        }
    }
}