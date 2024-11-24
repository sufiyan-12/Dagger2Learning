package com.learning.daggerlearning

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SqlLiteRepository @Inject constructor(private val analyticsService: AnalyticsService): UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(Tag, "user saved in database")
        analyticsService.trackEvents("Save User", "CREATE")
    }
}

class FirebaseRepository(private val analyticsService: AnalyticsService): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Tag, "user saved in firebase")
        analyticsService.trackEvents("Save User", "CREATE")
    }
}