package com.example.newsappcleanarch.data.repository.dataSource

import com.example.newsappcleanarch.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(): Response<APIResponse>
}