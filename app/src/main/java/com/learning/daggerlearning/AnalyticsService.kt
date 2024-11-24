package com.learning.daggerlearning

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface AnalyticsService {
    fun trackEvents(eventName: String, eventType: String)
}

@Singleton
class MixPanel @Inject constructor(): AnalyticsService {
    override fun trackEvents(eventName: String, eventType: String) {
        Log.d(Tag, "MixPanel: $eventName - $eventType")
    }
}

@Singleton
class FirebaseAnalytics: AnalyticsService {
    override fun trackEvents(eventName: String, eventType: String) {
        Log.d(Tag, "Firebase: $eventName - $eventType")
    }
}