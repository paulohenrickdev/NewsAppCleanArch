package com.example.newsappcleanarch.domain.usecase

import com.example.newsappcleanarch.data.model.APIResponse
import com.example.newsappcleanarch.data.util.Resource
import com.example.newsappcleanarch.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, page: Int): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines(country, page)
    }
}