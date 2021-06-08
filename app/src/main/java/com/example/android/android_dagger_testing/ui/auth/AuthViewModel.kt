package com.example.android.android_dagger_testing.ui.auth

import android.util.Log
import androidx.lifecycle.*
import com.example.android.android_dagger_testing.models.User
import com.example.android.android_dagger_testing.network.auth.AuthApi
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Inject dependencies - Note that the authApi is annotated with the nullable
 * symbol "?" to prevent compile failure
 */
class AuthViewModel @Inject constructor(
    private val authApi: AuthApi
    ) : ViewModel() {

    private val authUser = MediatorLiveData<User?>()

    fun authenticateWithId(userId: Int) {
        val source: LiveData<User?> = LiveDataReactiveStreams.fromPublisher(
            authApi.getUser(userId)
                !!.subscribeOn(Schedulers.io())
        )
        authUser.addSource(source) { user ->
            authUser.value = user
            authUser.removeSource(source)
        }
    }


    fun observeUser(): MediatorLiveData<User?> {
        return authUser
    }

    companion object {
        private const val TAG = "AuthViewModel"
    }

    init {
        Log.d(TAG, "AuthViewModel: viewmodel is working...")
    }
}



