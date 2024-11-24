package com.learning.daggerlearning

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessagesService(retryCount: Int) : NotificationService{
        return MessageService(retryCount)
    }

    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}