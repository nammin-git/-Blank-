package com.example.controlflow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class ControlFlow4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //기본적인 when문 사용법
        var now = 8
        when(now) {
            8, 9 -> {
                Log.d("when", "현재 시간은 8시 또는 9시입니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 9시가 아닙니다.")
            }
        }

        //when문에서 in으로 범위값 비교
        var ageOfMicheal = 19
        when (ageOfMicheal) {
            in 10..19 -> {
                Log.d("when", "마이클은 10대입니다.")
            }
            !in 10..19 -> {
                Log.d("when", "마이클은 10대가 아닙니다.")
            }
            else -> {
                Log.d("when", "마이클의 나이를 알 수 없습니다.")
            }
        }

        //파라미터 없는 when문
        var currentTime = 6
        when {
            currentTime == 5 -> {
                Log.d("when", "현재 시간은 5시입니다.")
            }
            currentTime > 5 -> {
                Log.d("when", "현재 시간은 5시가 넘었습니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 이전입니다.")
            }
        }


        //값을 특정할 수 있고 범위가 제한적 -> when
        //값을 특정할 수 없고 범위가 넓음 -> if
        var 요일 = '월'
        when(요일) {
            '월' -> {
                Log.d("when", "영어공부를 합니다.")
            }
            '화' -> {
                Log.d("when", "자전거 모임이 있습니다.")
            }
            '수' -> {
                Log.d("when", "친구를 만납니다.")
            }
            '목' -> {
                Log.d("when", "피아노를 칩니다.")
            }
            '금' -> {
                Log.d("when", "코딩 공부로 밤을 세웁니다.")
            }
            '토' -> {
                Log.d("when", "빨래를 합니다.")
            }
            '일' -> {
                Log.d("when", "집 청소를 합니다.")
            }
        }


    }

}