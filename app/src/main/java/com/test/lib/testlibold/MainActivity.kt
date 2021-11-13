package com.test.lib.testlibold

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.lib.server.Server

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Server().test()
    }
}