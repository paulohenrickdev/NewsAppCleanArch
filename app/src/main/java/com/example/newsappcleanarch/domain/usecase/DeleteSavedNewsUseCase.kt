package com.example.newsappcleanarch.domain.usecase

import com.example.newsappcleanarch.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
}