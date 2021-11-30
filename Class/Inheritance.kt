package com.example.aclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class Inheritance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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

//생성자 파라미터가 있는 클래스의 상속
open class SecondParent(age: Int) {
    var name = "Cathy"
    fun sayHello(age: Int, name: String) {
        Log.d("Inheritance", "Hello ${name, age}")
    }
}

class SecondChild(age: Int) : SecondParent {
    constructor(age: Int) : super(age)

}