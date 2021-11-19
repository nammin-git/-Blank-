package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName = "홍길동"
        var firstName = "Hong"
        var secondName = "Gil Dong"
        var myAge: Int
        myAge = 27
        myAge += 1

        Log.d("BasicSyntax", "myName = $myName, myAge = $myAge")
        Log.d("NameSyntax", "제 이름은 $firstName $secondName"+"입니다.")


        //조건문
        var myNumbers = "1,2,3,4,5,6"
        var thisWeekNumbers = "5,6,7,8,9,10"
        if(myNumbers==thisWeekNumbers){
            Log.d("Lotto", "당첨되었습니다.")
        }
        else{
            Log.d("Lotto", "꽝")
        }


    }
}