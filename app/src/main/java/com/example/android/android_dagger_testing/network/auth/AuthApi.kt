package com.example.android.android_dagger_testing.network.auth

import androidx.annotation.Nullable
import okhttp3.ResponseBody
import retrofit2.http.GET


interface AuthApi {


    @GET("fake")
    fun getFakeStuff(): retrofit2.Call<ResponseBody?>?
}