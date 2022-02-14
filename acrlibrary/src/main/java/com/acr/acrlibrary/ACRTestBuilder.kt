package com.acr.acrlibrary

import android.content.Context
import android.content.Intent
import android.util.Log

class ACRTestBuilder {

    private val configData: MutableList<String> = mutableListOf()

    fun withTrivia(value: String): ACRTestBuilder {
        Log.e("ACRGL", "ACRTestBuilder -> withTrivia")
        configData.add(value)
        return this
    }

    fun withQuestion(value: String): ACRTestBuilder {
        Log.e("ACRGL", "ACRTestBuilder -> withQuestion")
        configData.add(value)
        test(value)
        return this
    }

    fun startStartActivity(context: Context) {
        val intent = Intent(context, ACRActivity::class.java)
        intent.putExtra("config", ArrayList(configData))
        context.startActivity(intent)
    }

    private fun test(value: String): ACRTestBuilder {
        Log.e("ACRGL", "ACRTestBuilder -> test")
        configData.add(value)
        return this
    }
}