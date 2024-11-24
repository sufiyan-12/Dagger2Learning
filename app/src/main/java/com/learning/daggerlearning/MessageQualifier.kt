package com.learning.daggerlearning

import javax.inject.Qualifier
import kotlin.annotation.Retention

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class MessageQualifier()
