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

        //추상화 : 구현 단계에서 코드를 작성하도록 메서드의 이름만 작성
        //abstract 키워드 사용
        abstract class Design {
            abstract fun drawText()
            abstract fun draw()
            fun showWindow() {
                //코드
            }
        }

        class Implements : Design() {
            override fun drawText() {
                //구현 코드
            }
            override fun draw() {
                //구현 코드
            }
        }

        abstract class Animal {
            fun walk() {
                Log.d("abstract", "걷습니다.")
            }
            abstract fun move()
        }

        class Bird : Animal() {
            override fun move() {
                Log.d("abstract", "날아서 이동합니다.")
            }
        }

        class Dog : Animal() {
            override fun move() {
                Log.d("abstract", "뜁니다.")
            }
        }


        //인터페이스
        interface Beer {
            var name: String
            fun drink()
            fun cheer()
        }

        class Tsingtao : Beer {
            override var name: String = "TSINGTAO"
                get() = TODO("Not yet implemented")
                set(value) {}
            //왜 drink() cheer() 함수가 안 나오고 get() set() 함수가 나오지?
        }

        class Cass = object : Beer {
            override var name: String = "CASS"
        }
    }
}