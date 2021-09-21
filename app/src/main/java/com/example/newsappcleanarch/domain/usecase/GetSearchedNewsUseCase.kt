package com.example.newsappcleanarch.domain.usecase

import com.example.newsappcleanarch.data.model.APIResponse
import com.example.newsappcleanarch.data.util.Resource
import com.example.newsappcleanarch.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(searchQuery: String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}