package com.example.android.android_dagger_testing.di.auth

import androidx.annotation.Nullable
import com.example.android.android_dagger_testing.network.auth.AuthApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Add dependencies for Auth subcomponent
 */
@Module
class AuthModule {

    @Provides
    fun provideAuthApi(retrofit: Retrofit): AuthApi? {
        return retrofit.create(AuthApi::class.java)
    }

}