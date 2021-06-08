package com.example.android.android_dagger_testing.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.RequestManager
import com.example.android.android_dagger_testing.R
import com.example.android.android_dagger_testing.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity(), View.OnClickListener {

    val TAG = "AuthActivity"

    private var viewModel: AuthViewModel? = null
    private var userId: EditText? = null


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

        userId = findViewById(R.id.user_id_input)

        findViewById<View>(R.id.login_button).setOnClickListener(this)

        // Start the View Model
        viewModel = ViewModelProviders.of(this, providerFactory)[AuthViewModel::class.java]

        setLogo()

        subscribeObservers()
    }

    private fun setLogo() {
        requestManager
            ?.load(logo)
            ?.into(findViewById(R.id.login_logo))

    }

    private fun subscribeObservers() {
        viewModel!!.observeUser().observe(this, { user ->
            if (user != null) {
                Log.d(TAG, "onChanged: " + user.getEmail())
            }
        })
    }

    private fun attemptLogin() {
        if (TextUtils.isEmpty(userId!!.text.toString())) {
            return
        }
        viewModel!!.authenticateWithId(userId!!.text.toString().toInt())
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.login_button -> {
                attemptLogin()
            }
        }    }

}