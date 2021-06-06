package com.example.android.android_dagger_testing.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.RequestManager
import com.example.android.android_dagger_testing.R
import com.example.android.android_dagger_testing.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    val TAG = "AuthActivity"

    private var viewModel: AuthViewModel? = null

    // Instantiates the View Model
    @JvmField
    @Inject
    var providerFactory: ViewModelProviderFactory? = null

    @JvmField
    @Inject
    var logo: Drawable? = null

    @JvmField
    @Inject
    var requestManager: RequestManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        // Start the View Model
        viewModel = ViewModelProviders.of(this, providerFactory)[AuthViewModel::class.java]

        setLogo()
    }

    private fun setLogo() {
        requestManager
            ?.load(logo)
            ?.into(findViewById(R.id.login_logo))

    }

}