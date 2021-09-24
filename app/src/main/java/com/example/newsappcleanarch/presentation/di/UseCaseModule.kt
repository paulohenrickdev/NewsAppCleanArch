package com.example.newsappcleanarch.presentation.di

import com.example.newsappcleanarch.domain.repository.NewsRepository
import com.example.newsappcleanarch.domain.usecase.GetNewsHeadlinesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides                          // Utilizado no viewModel, portanto precisa passar pois o factory utiliza como parametro
    fun provideGetNewsHeadlinesUseCase(newsRepository: NewsRepository): GetNewsHeadlinesUseCase {
        return GetNewsHeadlinesUseCase(newsRepository)
    }
}