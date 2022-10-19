package com.example.cryptoapp.ui.detail

import com.example.cryptoapp.base.BaseRepository
import com.example.cryptoapp.network.ApiFactory
import javax.inject.Inject

class DetailRepository @Inject constructor(private val apiFactory: ApiFactory): BaseRepository(){

    suspend fun getDetail(
        apiKey: String,
        symbol: String
    ) = safeApiRequest {
        apiFactory.getDetail(apiKey, symbol)
    }

}