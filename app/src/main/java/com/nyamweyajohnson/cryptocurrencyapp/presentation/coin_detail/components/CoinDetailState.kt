package com.nyamweyajohnson.cryptocurrencyapp.presentation.coin_detail.components

import com.nyamweyajohnson.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
