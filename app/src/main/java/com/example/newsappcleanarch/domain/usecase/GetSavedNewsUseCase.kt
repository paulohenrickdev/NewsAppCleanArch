package com.example.newsappcleanarch.domain.usecase

import com.example.newsappcleanarch.data.model.Article
import com.example.newsappcleanarch.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val repository: NewsRepository) {

    fun execute(): Flow<List<Article>> {
        return repository.getSavedNews()
    }
}