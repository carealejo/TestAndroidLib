package com.acr.acrlibrary

import android.content.Context
import android.content.Intent
import androidx.annotation.Keep

class ACRTestBuilder {

    private val configData: MutableList<String> = mutableListOf()

    @Keep
    fun withTrivia(value: String): ACRTestBuilder {
        configData.add(value)
        return this
    }

    @Keep
    fun withQuestion(value: String): ACRTestBuilder {
        configData.add(value)
        return this
    }

    @Keep
    fun startStartActivity(context: Context) {
        val intent = Intent(context, ACRActivity::class.java)
        intent.putExtra("config", ArrayList(configData))
        context.startActivity(intent)
    }

    private fun test(value: String): ACRTestBuilder {
        configData.add(value)
        return this
    }
}