package com.dbarishic.brevis.model

import javax.validation.constraints.NotBlank

data class LoginRequest(@NotBlank val email: String,
                        @NotBlank val password: String)