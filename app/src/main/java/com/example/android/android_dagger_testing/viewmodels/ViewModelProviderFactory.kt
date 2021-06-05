//package com.example.android.android_dagger_testing.viewmodels
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import javax.inject.Inject
//import javax.inject.Provider
//import javax.inject.Singleton
//
///**
// * Assists in the injection of ViewModels
// */
//@Singleton
//class ViewModelProviderFactory @Inject constructor(
//    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
//) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        val creator = creators[modelClass] ?: creators.entries.firstOrNull {
//            modelClass.isAssignableFrom(it.key)
//        }?.value ?: throw IllegalArgumentException("unknown model class $modelClass")
//        @Suppress("UNCHECKED_CAST")
//        return creator.get() as T
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
