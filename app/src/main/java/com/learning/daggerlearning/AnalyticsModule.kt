package com.learning.daggerlearning

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getMixPanel(mixPanel: MixPanel): AnalyticsService {
        return mixPanel
    }
}