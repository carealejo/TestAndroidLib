package com.acr.acrlibrary

import android.content.Context
import android.content.Intent
import android.os.Bundle

class ACRTestBuilder() {

    private val configData: MutableList<String> = mutableListOf()

    fun withTrivia(value: String) {
        configData.add(value)
    }

    fun withQuestion(value: String) {
        configData.add(value)
    }

    fun startStartActivity(context: Context) {
        val intent = Intent(context, StartActivity::class.java)
        intent.putExtra("config", ArrayList(configData))
        context.startActivity(intent)
    }
}