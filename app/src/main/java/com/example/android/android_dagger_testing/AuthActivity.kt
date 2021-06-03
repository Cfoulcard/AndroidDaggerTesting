package com.example.android.android_dagger_testing

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

     val TAG = "AuthActivity"

    @JvmField
    @Inject
    var logo: Drawable? = null

    @JvmField
    @Inject
    var requestManager: RequestManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        setLogo()
    }

    private fun setLogo() {
        requestManager
            ?.load(logo)
            ?.into(findViewById(R.id.login_logo))

    }

}