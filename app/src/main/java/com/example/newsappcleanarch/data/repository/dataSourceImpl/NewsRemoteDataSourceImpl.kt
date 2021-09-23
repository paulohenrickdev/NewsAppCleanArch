package com.example.newsappcleanarch.data.repository.dataSourceImpl

import com.example.newsappcleanarch.data.api.NewsAPIService
import com.example.newsappcleanarch.data.model.APIResponse
import com.example.newsappcleanarch.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }

}