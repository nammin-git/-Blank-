package com.example.array

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Array : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //배열 객체를 만드는 방법 = 기본타입 + Array + (size)
        var intArray = IntArray(10)
        var longArray = LongArray(10)
        var floatArray = FloatArray(10)
        var charArray = CharArray(10)

        //문자 배열에 빈 공간 할당하기
        var stringArray = Array(10, {item -> ""})

        //arrayOf() 함수 이용하기
        var students = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        var dayArray = arrayOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

        //students 변수의 값 변경하기
        students[0] = 90
        students[1] = 91
        students[2] = 92
        students[3] = 93
        students[4] = 94
        students.set(5, 95)
        students.set(6, 96)
        students.set(7, 97)
        students.set(8, 98)
        students.set(9, 99)

        //배열 값 사용하기
        var seventhValue = students[6]
        Log.d("Array", "students 배열의 일곱 번째 값은 ${seventhValue}입니다.")

        Log.d("Array", "students 배열의 첫 번째 값은 ${students[0]}입니다.")
        Log.d("Array", "dayArray 배열의 여섯 번째 값은 ${dayArray.get(5)}입니다.")

    }
}