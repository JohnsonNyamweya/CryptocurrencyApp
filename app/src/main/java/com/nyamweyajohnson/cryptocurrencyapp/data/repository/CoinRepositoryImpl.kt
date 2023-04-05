package com.nyamweyajohnson.cryptocurrencyapp.data.repository

import com.nyamweyajohnson.cryptocurrencyapp.data.CoinPaprikaApi
import com.nyamweyajohnson.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.nyamweyajohnson.cryptocurrencyapp.data.remote.dto.CoinDto
import com.nyamweyajohnson.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}