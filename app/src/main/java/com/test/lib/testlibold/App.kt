package com.test.lib.testlibold

import android.app.Application
import com.pablogd.coreold.Configuration

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Configuration.config()
    }

}