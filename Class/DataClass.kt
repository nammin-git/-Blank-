package com.example.aclass

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class DataClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data class DataUser (var name: String, var age: Int)
        var dataUser = DataUser("Micheal", 54)
        Log.d("DataClass", "원본 DataUser는 ${dataUser.toString()}")

        var newData = dataUser.copy()
        Log.d("DataClass", "복사본 newUser는 ${newData.toString()}")
    }
}