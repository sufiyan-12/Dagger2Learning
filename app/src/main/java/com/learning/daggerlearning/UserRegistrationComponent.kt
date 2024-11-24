package com.learning.daggerlearning

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(activity: MainActivity)

    fun getEmailService(): EmailService

//    @Subcomponent.Factory
//    interface Factory {
//        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
//    }

    @Subcomponent.Builder
    interface Builder{
        fun build(): UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int): Builder
    }
}