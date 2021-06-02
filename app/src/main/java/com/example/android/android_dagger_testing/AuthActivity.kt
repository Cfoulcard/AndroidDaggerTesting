package com.example.android.android_dagger_testing

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

     val TAG = "AuthActivity"

    @JvmField // Needed as Kotlin will produce an error converting Dagger/Java
    @Inject
    var text: String? = null

    @JvmField
    @Inject
    var isAppNull = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val log = Log.d(TAG, text.toString())
        val log2 = Log.d(TAG, isAppNull.toString())

    }

}