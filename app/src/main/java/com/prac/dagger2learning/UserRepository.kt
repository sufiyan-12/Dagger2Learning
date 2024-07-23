package com.prac.dagger2learning

import android.util.Log

class UserRepository {
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "user saved in database")
    }
}