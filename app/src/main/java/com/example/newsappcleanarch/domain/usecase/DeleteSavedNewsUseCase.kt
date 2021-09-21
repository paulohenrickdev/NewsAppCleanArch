package com.example.newsappcleanarch.domain.usecase

import com.example.newsappcleanarch.data.model.Article
import com.example.newsappcleanarch.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article) {
        newsRepository.deleteNews(article)
    }
}