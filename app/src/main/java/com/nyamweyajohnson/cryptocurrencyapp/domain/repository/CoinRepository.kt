package com.nyamweyajohnson.cryptocurrencyapp.domain.repository

import com.nyamweyajohnson.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.nyamweyajohnson.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}