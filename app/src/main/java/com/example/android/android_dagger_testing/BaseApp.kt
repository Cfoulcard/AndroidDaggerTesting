package com.example.android.android_dagger_testing

import android.util.Log
import com.example.android.android_dagger_testing.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Dagger Setup - This is the entry point that initializes first when the app is created
 * This is using the Dagger Support to handle older libraries. This class name is
 * also declared in the Android Manifest File to be instantiated before any other class
 *
 * This class and AppComponent provide the code needed to initialize Dagger on most projects,
 * making it good to copy and paste
 */
class BaseApp : DaggerApplication() {

    val log = Log.d("Singleton", "I'm here!")

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {

        // DaggerAppComponent is generated after rebuilding the project via the AppComponent.
        return DaggerAppComponent.builder().application(this)?.build()
    }
}

