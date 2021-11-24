package com.example.collection

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ListCollection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //list : 중복된 값을 저장
        //mutableList : 크기 고정하지 않고 동적으로 크기 지정
        var mutableList = mutableListOf<String>("Mon", "TUE", "WED")

        //값 추가 -> add 함수
        mutableList.add("THU")
        Log.d("Collection", "mutableList의 첫 번째 값은 ${mutableList.get(0)}입니다.")
        Log.d("Collection", "mutableList의 두 번째 값은 ${mutableList.get(1)}입니다.")
        Log.d("Collection", "mutableList의 세 번째 값은 ${mutableList.get(2)}입니다.")
        Log.d("Collection", "mutableList의 네 번째 값은 ${mutableList.get(3)}입니다.")

        //값 변경 -> set 함수
        mutableList.set(0, "MON")
        Log.d("Collection", "---------값 변경---------")
        Log.d("Collection", "mutableList의 첫 번째 값은 ${mutableList.get(0)}입니다.")

        //값 제거하기 -> removeAt 함수
        mutableList.removeAt(1)
        Log.d("Collection", "---------값 제거---------")
        Log.d("Collection", "mutableList의 두 번째 값은 ${mutableList.get(1)}입니다.")

        //개수 출력하기
        Log.d("Collection", "---------개수 출력---------")
        Log.d("Collection", "mutableList에는 ${mutableList.size}개의 값이 있습니다.")

    }
}