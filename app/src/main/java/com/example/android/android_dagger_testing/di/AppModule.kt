package com.example.android.android_dagger_testing.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    // Used to declare dependencies to be used by other activities
    @Provides
    fun someString(): String {
        return "This is a test string"
    }

    @Provides
    fun getApp(application: Application?): Boolean {
        return application == null
    }

}