package com.example.android.android_dagger_testing.di

import android.app.Application
import com.example.android.android_dagger_testing.BaseApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Persists throughout the entire lifecycle of the application. Needs the
 * AndroidSupportInjectionModule to generate the DaggerAppComponent in the
 * Base App! This also owns the Singleton scope.
 */

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuildersModule::class,
    AppModule::class,
    ViewModelFactoryModule::class
])
interface AppComponent : AndroidInjector<BaseApp> {
    @Component.Builder
    interface Builder {

        // Binds an object at the time of its construction
        @BindsInstance
        fun application(application: Application?): Builder?
        fun build(): AppComponent?
    }

    override fun inject(instance: BaseApp?) {
        return
    }
}