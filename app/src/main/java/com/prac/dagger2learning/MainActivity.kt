package com.prac.dagger2learning

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailService = EmailService()
        val userRepository = UserRepository()
        val userRegistrationService = UserRegistrationService(emailService, userRepository)
        userRegistrationService.registerUser("msufiyan576@gmail.com", "123456")
    }
}