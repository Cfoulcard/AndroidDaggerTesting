package com.example.android.android_dagger_testing.di.auth

import androidx.lifecycle.ViewModel
import com.example.android.android_dagger_testing.di.ViewModelKey
import com.example.android.android_dagger_testing.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Dependency for Auth ViewModel. Used for ViewModel multibinding
 */
@Module
abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(viewModel: AuthViewModel?): ViewModel?
}