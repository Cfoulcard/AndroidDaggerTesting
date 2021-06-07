package com.example.android.android_dagger_testing.network.auth

import com.example.android.android_dagger_testing.models.User
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Uses Retrofit to get API info from the User model
 */
interface AuthApi {

    @GET("users/{id}")
    fun getUser(@Path("id") id: Int): Flowable<User?>?

}