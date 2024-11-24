package com.learning.daggerlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService2: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        builder pattern
//        val component = DaggerUserRegistrationComponent
//            .builder()
//            .notificationServiceModule(NotificationServiceModule(3))
//            .build()

//        factory pattern
//        val component = DaggerUserRegistrationComponent
//            .factory()
//            .create(3)
//        component.inject(this)

//        val appComponent = (application as UserApplication).appComponent
//        val component = DaggerUserRegistrationComponent
//            .factory()
//            .create(3, appComponent)

//        val appComponent = (application as UserApplication).appComponent
//        val subComponent = appComponent.getUserRegistrationComponentFactory().create(3)
//        subComponent.inject(this)


        val appComponent = (application as UserApplication).appComponent
        val subComponent = appComponent.getUserRegistrationComponentBuilder()
            .retryCount(3)
            .build()
        subComponent.inject(this)
        userRegistrationService.registerUser("william.johnson@example-pet-store.com", "123456")
    }
}
// dagger crux
// 1. consumers -> activity, fragment
// 2. connector -> components
// 3. providers -> module, constructor