package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //클래스의 생성자를 호출
        Kotlin()
        //인스턴스 = 생성자가 호출된 후 생성되는 것
        var kotlin = Kotlin()

        //파라미터가 있는 생성자 호출
        var one = KotlinOne("value")

        var kotlinThree = KotlinThree()
        kotlinThree.word = "new value"
        kotlinThree.printOne()
    }

    class Kotlin {
        init {
            Log.d("class", "Kotlin 클래스를 호출하였습니다.")
        }
    }

    //프라이머리 생성자
    class KotlinOne constructor(value : String) {
        init {
            Log.d("class", "생성자로부터 전달받은 값은 ${value}입니다.")
        }
    }

    //세컨더리 생성자
    class KotlinTwo {
        constructor (value: String) {
            Log.d("class", "생성자로부터 전달받은 값은 ${value}입니다.")
        }
    }

    class KotlinThree {
        var word: String = "None"
        fun printOne() {
            Log.d("class", "word에 입력된 값은 ${word}입니다.")
        }
    }
}