package com.example.android.android_dagger_testing.di

import com.example.android.android_dagger_testing.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Modules are basically something used to hold dependencies. Here is where we add activities
 * we want to inject with dependencies. As the project builds more activities will be added here.
 */
@Module
abstract class ActivityBuildersModule {

    // Let's dagger know that AuthActivity is a potential client for dependency injection
    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity

}