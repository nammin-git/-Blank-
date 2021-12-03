package com.example.designtool
//패키지 : 클래스와 소스 파일을 관리하기 위한 디렉토리 구조의 저장 공간
//pacakge 메인디렉토리.서브디렉토리

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //접근 제한자 테스트
        var child = Child()
        child.callValues()
    }
}


//추상화 : 구현 단계에서 코드를 작성하도록 메서드의 이름만 작성
//abstract 키워드 사용
//추상 클래스 설계
abstract class Design {
    abstract fun drawText()
    abstract fun draw()
    fun showWindow() {
        //코드
    }
}

//구현
class Implements : Design() {
    override fun drawText() {
        //구현 코드
    }
    override fun draw() {
        //구현 코드
    }
}

//추상 클래스 설계 2
abstract class Animal {
    fun walk() {
        Log.d("abstract", "걷습니다.")
    }
    abstract fun move()
}

//구현 2
class Bird : Animal() {
    override fun move() {
        Log.d("abstract", "날아서 이동합니다.")
    }
}

//구현 3
class Dog : Animal() {
    override fun move() {
        Log.d("abstract", "뜁니다.")
    }
}


//인터페이스 설계
interface Beer {
    var name: String
    fun drink()
    fun cheer()
}

//구현
class Tsingtao : Beer {
    override var name: String = "TSINGTAO"
        get() = TODO("Not yet implemented")
        set(value) {}
    //왜 drink() cheer() 함수가 안 나오고 get() set() 함수가 나오지?
    override fun drink() {
        Log.d("interface", "Drink tsingtao")
    }
    override fun cheer() {
        Log.d("interface", "Cheers!")
    }
}


//접근 제한자
//접근 제한자 테스트를 위한 부모 클래스
open class Parent {
    private val privateVal = 1
    protected open val protectedVal = 2
    internal val internalVal = 3
    val defaultVal = 4
}

//접근 제한자 테스트를 위한 자식 클래스
class Child : Parent() {
    fun callValues() {
        Log.d("Modifier", "private 변수의 값은 호출되지 않습니다.")
        Log.d("Modifier", "protected 변수의 값은 ${protectedVal}")
        Log.d("Modifier", "internal 변수의 값은 ${internalVal}")
        Log.d("Modifier", "default 변수의 값은 ${defaultVal}")
    }
}

//접근 제한자 테스트를 위한 외부인 클래스
class Stranger {
    fun callValues() {
        val parent = Parent()
        Log.d("Modifier", "private 변수의 값은 호출되지 않습니다.")
        Log.d("Modifier", "protected 변수의 값은 호출되지 않습니다.")
        Log.d("Modifier", "internal 변수의 값은 ${parent.internalVal}")
        Log.d("Modifier", "default 변수의 값은 ${parent.defaultVal}")
    }
}


//제네릭
fun testGenerics() {
    var list: MutableList<String> = mutableListOf()
    list.add("월")
    list.add("화")
    list.add("수")

    for (item in list) {
        Log.d("Generic", "list에 입력된 값은 ${item}")
    }
}
