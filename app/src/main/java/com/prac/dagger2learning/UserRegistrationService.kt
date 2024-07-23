package com.prac.dagger2learning

class UserRegistrationService(
    private val emailService: EmailService,
    private val userRepository: UserRepository
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "RrjXa@example.com", "Welcome")
    }
}