package com.learning.daggerlearning

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getSqlLiteRepository(sqlLiteRepository: SqlLiteRepository) : UserRepository
}