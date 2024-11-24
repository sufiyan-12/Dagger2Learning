package com.learning.daggerlearning

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getAnalyticsService(): AnalyticsService
    fun getUserRegistrationComponentBuilder() : UserRegistrationComponent.Builder
}