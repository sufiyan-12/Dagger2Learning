package com.learning.daggerlearning

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

@ActivityScope
class EmailService @Inject constructor(): NotificationService {
    override fun send(to: String, from: String, body: String?){
        Log.d(Tag, "email sent")
    }
}

class MessageService(private val retryCount: Int): NotificationService {
    override fun send(to: String, from: String, body: String?){
        Log.d(Tag, "Message sent- retry count: $retryCount")
    }

}