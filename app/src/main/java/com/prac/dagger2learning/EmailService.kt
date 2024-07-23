package com.prac.dagger2learning

import android.util.Log

class EmailService {

    fun send(to: String, from: String, body: String?){
        Log.d(TAG, "email sent")
    }
}