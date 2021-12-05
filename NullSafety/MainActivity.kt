package com.example.nullsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nullable2: String? = null
        var size2 = nullable2?.length
        Log.d("NullSafety", "문자열의 길이 = $size2")

        var nullable3: String? = null
        var size3 = nullable2?.length?:33
        Log.d("NullSafety", "문자열의 길이 = $size3")
    }
}