package com.learning.daggerlearning

import android.app.Application
import javax.inject.Inject

class UserApplication: Application() {

    @Inject
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()
    }
}