package com.D121211089.bluearchive

import android.app.Application
import com.D121211089.bluearchive.data.AppContainer
import com.D121211089.bluearchive.data.DefaultAppContainer

class MyApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}