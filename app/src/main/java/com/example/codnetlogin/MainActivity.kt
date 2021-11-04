package com.example.codnetlogin

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn1 : Button
    private lateinit var btn2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btn1 = findViewById(R.id.Btn_Login)
        btn2 = findViewById(R.id.Btn_SignUp)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.Btn_Login -> {
                Log.d(TAG, "onClick() Btn_Login")
            }
            R.id.Btn_SignUp -> {
                Log.d(TAG, "onClick() Btn_SignUp")
            }
            else -> {
                Log.d(TAG, "onClick() invalid btn id")
            }
        }
    }

}