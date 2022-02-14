package com.acr.acrlibrary

import android.content.Context
import android.content.Intent

class ACRTestBuilder {

    private val configData: MutableList<String> = mutableListOf()

    fun withTrivia(value: String): ACRTestBuilder {
        configData.add(value)
        return this
    }

    fun withQuestion(value: String): ACRTestBuilder {
        configData.add(value)
        return this
    }

    fun startStartActivity(context: Context) {
        val intent = Intent(context, StartActivity::class.java)
        intent.putExtra("config", ArrayList(configData))
        context.startActivity(intent)
    }
}