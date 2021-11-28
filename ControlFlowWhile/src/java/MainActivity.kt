package com.example.controlflowwhile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //일반적인 while문
        var current = 1
        var until = 12
        while (current < until) {
            Log.d("While", "현재 값은 ${current}입니다.")
            current += 1
        }
        
        //do~while
        var game = 1
        var match = 6
        do {
            Log.d("While", "${game}게임 이겼습니다. 우승까지 ${match-game}게임 남았습니다.")
            game += 1
        } while (game < match)

        //break
        for(index in 1..10) {
            Log.d("break", "현재 index는 ${index}입니다.")
            if(index >5) {
                break
            }
        }
        
        for(except in 1..10) {
            if(except > 3 && except < 8) {
                continue
            }
            Log.d("continue", "현재 index는 ${except}입니다.")
        }

    }
}