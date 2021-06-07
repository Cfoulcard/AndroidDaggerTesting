package com.example.android.android_dagger_testing.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class User {

    constructor(id: Int?, username: String?, email: String?, website: String?) {
        this.id = id
        this.username = username
        this.email = email
        this.website = website
    }

    constructor()

    // SerializedName is used to convert an object to a string/data for JSON by looking for the
    // associated response within the JSON. Expose allows full manipulation for the serialization
    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("username")
    @Expose
     private var username: String? = null

    @SerializedName("email")
    @Expose
     private var email: String? = null

    @SerializedName("website")
    @Expose
    private var website: String? = null

    // Getters and Setters

    open fun getId(): Int {
        return id!!
    }

    open fun setId(id: Int) {
        this.id = id
    }

    open fun getUsername(): String? {
        return username
    }

    open fun setUsername(username: String?) {
        this.username = username
    }

    open fun getEmail(): String? {
        return email
    }

    open fun setEmail(email: String?) {
        this.email = email
    }

    open fun getWebsite(): String? {
        return website
    }

    open fun setWebsite(website: String?) {
        this.website = website
    }
}