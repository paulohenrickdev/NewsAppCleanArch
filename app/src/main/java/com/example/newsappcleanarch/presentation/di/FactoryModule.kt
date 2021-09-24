package com.example.newsappcleanarch.presentation.di

import android.app.Application
import com.example.newsappcleanarch.domain.usecase.GetNewsHeadlinesUseCase
import com.example.newsappcleanarch.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        app: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(app, getNewsHeadlinesUseCase)
    }
}