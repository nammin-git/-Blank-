package com.example.function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //반환값과 입력값이 있는 함수
        fun square(x : Int) : Int {
            return x*x
        }

        //입력값만 있는 함수
        fun printSum(x : Int, y : Int) {
            Log.d("fun", "x + y = ${x+y}")
        }

        //반환값만 있는 함수
        fun getPi() : Double {
            return 3.14
        }

        //함수의 호출
        var squareResult = square(30)
        Log.d("fun", "30의 제곱은 ${squareResult}입니다.")

        printSum(3, 5)

        val PI = getPi()
        Log.d("fun", "지름이 10인 원의 둘레는 ${10*PI}입니다.")

        //파라미터의 기본값 정의와 호출
        fun newFunction(name: String, age: Int = 29, weight: Double = 65.5) {
            Log.d("fun", "name의 값은 ${name}입니다.")
            Log.d("fun", "age의 값은 ${age}입니다.")
            Log.d("fun", "weight의 값은 ${weight}입니다.")
        }

        newFunction("Hello", weight = 67.5)


        //더하기 함수
        fun add(x: Int, y: Int) : Int {
            return x+y
        }

        //입력값까지 더하는 함수
        fun addUntilVar(x: Int) : Int {
            var sum = 0
            for(index in 0..x) {
                sum += index
                return sum
            }
            Log.d("fun", "총합 = ${sum}")
        }

        //입력된 값을 그대로 출력하는 함수
        fun printString(word: String) : String {
            return word
        }
        println("${printString("word")}")
    }
}