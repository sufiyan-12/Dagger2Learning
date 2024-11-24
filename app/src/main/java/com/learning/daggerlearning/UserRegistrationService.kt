package com.learning.daggerlearning

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    @MessageQualifier private val notificationService: NotificationService,
    private val userRepository: UserRepository
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "RrjXa@example.com", "Welcome")
    }
}