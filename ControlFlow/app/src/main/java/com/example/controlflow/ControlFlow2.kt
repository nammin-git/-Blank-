package com.example.controlflow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ControlFlow2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 1
        var b = 2
        var c = 3

        if(a<b) {
            Log.d("ControlFlow", "a는 b보다 작습니다.")
        } else if(a<c){
            Log.d("ControlFlow", "a는 c보다 작습니다.")
        }

        /*
        //변수에 직접 if문 사용하기
        var bigger : Int = if(a>b) a else b
        Log.d("ControlFlow", "bigger = $bigger")


        //마지막 줄의 a 값이 변수 bigger 에 저장
        var bigger : Unit = if (a > b) {
            a = a-b
            a} else {
            0}
        }
        Log.d("ControlFlow", "a is $bigger more than b")
        */
    }
}
