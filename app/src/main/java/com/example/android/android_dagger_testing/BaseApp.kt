package com.example.android.android_dagger_testing

import android.util.Log
import com.example.android.android_dagger_testing.di.AppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Dagger Setup - This is the entry point that initialized first when the app is created
 * This is using the Dagger Support to handle older libraries. This class name is
 * also declared in the Android Manifest File to be instantiated before any other class
 */
class BaseApp : DaggerApplication() {

    val log = Log.d("Singleton", "I'm here!")

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
     return null
    }
}