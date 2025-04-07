package com.chatter.chatterplayv2.feature.auth.domain

sealed class AuthState {
    data object Initial : AuthState()
    data object Loading : AuthState()
    data class Success(val userId: String) : AuthState()
    data class Error(val message: String) : AuthState()
} 