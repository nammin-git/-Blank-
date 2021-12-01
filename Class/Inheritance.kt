package com.example.aclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class Inheritance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var event = ChildClass()

        //String 익스텐션 테스트하기
        testStringExtension()
    }

}

//클래스의 상속
open class FirstParent {
    var name = "John"
    fun sayName() {
        Log.d("Inheritance", "${name}")
    }
}

class FirstChild : FirstParent() {
    fun myName() {
        name = "Johnson"
        sayName()
    }
}

//오버라이드
open class BaseClass {
    open fun opened() {
        Log.d("Inheritance", "BaseClass is opened.")
    }
    open fun notOpened() {
        Log.d("Inheritance", "BaseClass is not opened.")
    }
}

class ChildClass : BaseClass() {
    override fun opened() {
        Log.d("Inheritance", "ChildClass is Opened.")
    }

    override fun notOpened() {
        Log.d("Inheritance", "ChildClass is Opened.")
    }
}

//익스텐션
fun testStringExtension() {
    var original = "Hello"
    var added = " Guys~"
    //plus 함수를 통하여 문자열을 더할 수 있습니다.
    Log.d("Extension", "added를 더한 값은 ${original.plus(added)}")
}

fun String.plus(word: String): String {
    return this + word
}