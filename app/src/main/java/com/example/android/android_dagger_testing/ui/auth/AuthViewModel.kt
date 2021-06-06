package com.example.android.android_dagger_testing.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.android.android_dagger_testing.network.auth.AuthApi
import javax.inject.Inject


/**
 * Inject dependencies - Note that the authApi is annotated with the nullable symbol "?" to prevent compile failure
 */
class AuthViewModel @Inject constructor(private val authApi: AuthApi?) : ViewModel() {

    companion object {
        private const val TAG = "AuthViewModel"
    }

    init {
        Log.d(TAG, "AuthViewModel: viewmodel is working...")

        if (authApi != null) {
            Log.d(TAG, "AuthApi is NOT NULL")
        } else {
            Log.d(TAG, "AuthApi is NULL")
        }
    }
}
