package com.example.android.android_dagger_testing.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.android.android_dagger_testing.R
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    // Singletons are annotated below to make sure they are instantiated within the same scope as
    // the Singleton in AppComponent

    // Dependency to fill in placeholder images
    @Singleton
    @Provides
    fun provideRequestOptions(): RequestOptions {
        return RequestOptions
            .placeholderOf(R.drawable.white_background)
            .error(R.drawable.white_background)
    }

    // Initialize Glide globally in the application along with Glide Requests
    @Singleton
    @Provides
    fun provideGlideInstance(
        application: Application?,
        requestOptions: RequestOptions?
    ): RequestManager {
        return Glide.with(application!!)
            .setDefaultRequestOptions(requestOptions!!)
    }

    // Used for the logo
    @Singleton
    @Provides
    fun provideAppDrawable(application: Application?): Drawable? {
        return ContextCompat.getDrawable(application!!, R.drawable.logo)
    }




}