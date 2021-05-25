package com.example.android.android_dagger_testing.di

import android.app.Application
import com.example.android.android_dagger_testing.BaseApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Persists throughout the entire lifecycle of the application
 */
@Component(modules = [AndroidSupportInjectionModule::class])

interface AppComponent : AndroidInjector<BaseApp> {
    @Component.Builder
    interface Builder {

        // Binds an object at the time of its construction
        @BindsInstance
        fun application(application: Application?): AppComponent.Builder?
        fun build(): AppComponent?
    }

    override fun inject(instance: BaseApp?) {
        return
    }
}