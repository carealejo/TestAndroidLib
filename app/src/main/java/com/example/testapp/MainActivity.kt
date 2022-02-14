package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acr.acrlibrary.ACRTestBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = ACRTestBuilder("test1").withQuestion("test2")
    }
}