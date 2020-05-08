package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

// register this class in manifest
class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree()) // initialize timber
    }
}