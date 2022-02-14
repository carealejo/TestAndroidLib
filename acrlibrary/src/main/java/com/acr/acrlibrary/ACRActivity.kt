package com.acr.acrlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class ACRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    fun testPublic() {
        Log.e("ACRGL", "This is the public method ")
    }

    private fun testPrivate() {
        Log.e("ACRGL", "This is the public method ")
    }
}