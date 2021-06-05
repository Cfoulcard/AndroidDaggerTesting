package com.example.android.android_dagger_testing.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import dagger.Provides
import kotlin.reflect.KClass

/**
 *
 * This class can be copy and pasted for other projects with slight code modifications (Key type/name)
 */


@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@MapKey

annotation class ViewModelKey(val value: KClass<out ViewModel>)

// KClass represents/defines a class of a certain type, in this case a ViewModel
// out keyword is used for declaration site variance to make sure the specified type is returned
// out can also be thought of as "produce but don't consume"
// the "in" keyword is just the opposite: "consume but don't produce"
