package com.example.newsappcleanarch.domain.usecase

import com.example.newsappcleanarch.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
}