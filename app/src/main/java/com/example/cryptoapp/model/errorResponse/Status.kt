package com.example.cryptoapp.model.errorResponse

data class Status(
    val credit_count: Int,
    val elapsed: Int,
    val error_code: Int,
    val error_message: String,
    val timestamp: String
)