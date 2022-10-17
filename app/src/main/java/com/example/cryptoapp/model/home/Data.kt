package com.example.cryptoapp.model.home

data class Data(
    val circulating_supply: Double,
    val cmc_rank: Int,
    val date_added: String,
    val id: Int,
    val last_updated: String,
    val max_supply: Long,
    val name: String,
    val num_market_pairs: Int,
    val platform: Platform,
    val quote: Quote,
    val self_reported_circulating_supply: Any,
    val self_reported_market_cap: Any,
    val slug: String,
    val symbol: String,
    val tags: List<String>,
    val total_supply: Double,
    val tvl_ratio: Any
)