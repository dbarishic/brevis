package com.dbarishic.brevis.model

data class JwtAuthenticationResponse(val token: String, val tokenType: String = "Bearer")