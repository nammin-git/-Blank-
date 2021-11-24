package com.example.collection

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SetCollection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set 초기화
        var setMonth = mutableSetOf<String>()

        //값 추가하기 -> add 함수
        setMonth.add("JAN")
        setMonth.add("FEB")
        setMonth.add("MAR")
        Log.d("Collection", "Set 전체 출력 = ${setMonth}")

        //값 삭제하기 -> remove 함수
        //인덱스가 없기 때문에 값을 직접 삭제해야함
        setMonth.remove("FEB")
        Log.d("Collection", "Set 전체 출력 = ${setMonth}")

    }
}