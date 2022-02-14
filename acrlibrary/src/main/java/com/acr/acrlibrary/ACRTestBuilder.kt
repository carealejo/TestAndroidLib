package com.acr.acrlibrary

import android.content.Context
import android.content.Intent
import androidx.annotation.Keep
import com.acr.acrlibrary.utils.Utils

class ACRTestBuilder {

    private val configData: MutableList<String> = mutableListOf()

    @Keep
    fun withTrivia(value: String): ACRTestBuilder {
        Utils.print("ACRTestBuilder -> withTrivia")
        configData.add(value)
        return this
    }

    @Keep
    fun withQuestion(value: String): ACRTestBuilder {
        Utils.print("ACRTestBuilder -> withQuestion")
        configData.add(value)
        test(value)
        return this
    }

    @Keep
    fun startStartActivity(context: Context) {
        val intent = Intent(context, ACRActivity::class.java)
        intent.putExtra("config", ArrayList(configData))
        context.startActivity(intent)
    }

    private fun test(value: String): ACRTestBuilder {
        Utils.print( "ACRTestBuilder -> test")
        configData.add(value)
        return this
    }
}