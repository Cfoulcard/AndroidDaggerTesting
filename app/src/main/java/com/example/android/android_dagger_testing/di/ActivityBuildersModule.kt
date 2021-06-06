package com.example.android.android_dagger_testing.di

import com.example.android.android_dagger_testing.di.auth.AuthModule
import com.example.android.android_dagger_testing.di.auth.AuthViewModelsModule
import com.example.android.android_dagger_testing.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Modules are basically something used to hold dependencies. Here is where we add activities
 * we want to inject with dependencies. As the project builds more activities will be added here.
 *
 * Will also automatically generate subcomponents (under generated Java)
 */
@Module
abstract class ActivityBuildersModule {

    // Let's dagger know that AuthActivity is a potential client for dependency injection
    // Same for AuthModule
    @ContributesAndroidInjector(modules = [AuthViewModelsModule::class, AuthModule::class])
    abstract fun contributeAuthActivity(): AuthActivity

}