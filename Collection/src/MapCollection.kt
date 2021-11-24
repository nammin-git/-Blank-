package com.example.collection

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MapCollection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Map 생성하기
        var map = mutableMapOf<String, String> ()

        //값 추가하기-> put 함수
        map.put("키1", "값2")
        map.put("키2", "값2")
        map.put("키3", "값3")

        //값 사용하기 -> get 함수
        Log.d("Collection", "map에 입력된 키1의 값은 ${map.get("키1")}입니다.")

        //값 수정하기 -> put 함수
        map.put("키1", "값1")
        Log.d("Collection", "map에 입력된 키1의 값은 ${map.get("키1")}입니다.")

        //삭제하기 -> remove 함수
        //해당 키 값만 삭제됨, 다른 키들은 변화 없음
        map.remove("키2")
        Log.d("Collection", "map에 입력된 키2의 값은 ${map.get("키2")}입니다.")
    }
}