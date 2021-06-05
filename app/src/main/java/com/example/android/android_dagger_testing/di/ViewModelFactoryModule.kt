package com.example.android.android_dagger_testing.di

import androidx.lifecycle.ViewModelProvider
import com.example.android.android_dagger_testing.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

/*
Responsible for ViewModel injection in the ViewModel factory class
 */

@Module()
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(modelProviderFactory: ViewModelProviderFactory?): ViewModelProvider.Factory?

}