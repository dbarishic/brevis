package com.dbarishic.brevis.web.rest

import com.dbarishic.brevis.domain.Role.RoleRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.dbarishic.brevis.security.JwtTokenProvider
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import com.dbarishic.brevis.domain.user.UserRepository
import com.dbarishic.brevis.model.JwtAuthenticationResponse
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.http.ResponseEntity
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import com.dbarishic.brevis.model.LoginRequest
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import com.dbarishic.brevis.domain.user.User
import com.dbarishic.brevis.model.RegisterRequest
import com.dbarishic.brevis.domain.enumeration.RoleName
import java.util.*


@RestController
@RequestMapping("/api/auth")
class AuthenticationResource {
    @Autowired
    lateinit var authenticationManager: AuthenticationManager

    @Autowired
    lateinit var userRepository: UserRepository

    @Autowired
    lateinit var roleRepository: RoleRepository

    @Autowired
    lateinit var passwordEncoder: PasswordEncoder

    @Autowired
    lateinit var tokenProvider: JwtTokenProvider

    @PostMapping("/login")
    fun authenticateUser(@Valid @RequestBody loginRequest: LoginRequest): ResponseEntity<*> {

        val authentication = authenticationManager.authenticate(
                UsernamePasswordAuthenticationToken(
                        loginRequest.email,
                        loginRequest.password
                )
        )

        SecurityContextHolder.getContext().authentication = authentication

        val jwt = tokenProvider.generateToken(authentication)
        return ResponseEntity.ok<Any>(JwtAuthenticationResponse(jwt))
    }

    @PostMapping("")
    fun registerUser(@Valid @RequestBody registerRequest: RegisterRequest): ResponseEntity<*> {
        if (userRepository.existsByEmail(registerRequest.email)!!) {
            return ResponseEntity.badRequest().body("Email already registered")
        }

        val userRole = roleRepository.findByName(RoleName.ROLE_USER)

        val user = User(null, registerRequest.email, passwordEncoder.encode(registerRequest.password), Collections.singleton(userRole.get()))

        val result: User = userRepository.save(user)

        return ResponseEntity.ok("Successfully registered!")
    }
}