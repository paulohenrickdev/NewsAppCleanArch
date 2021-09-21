package com.example.newsappcleanarch.domain.usecase

import com.example.newsappcleanarch.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
}