package com.dbarishic.brevis.security

import com.dbarishic.brevis.domain.user.User
import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.GrantedAuthority
import java.util.stream.Collectors
import org.springframework.security.core.authority.SimpleGrantedAuthority



class UserPrincipal(val id: Long,
                    private val email: String,
                    @JsonIgnore private val password: String,
                    private val authorities: Collection<GrantedAuthority>) : UserDetails {

    override fun getPassword(): String {
        return password
    }

    companion object {
        fun create(user: User): UserPrincipal {
            val authorities = user.roles.stream().map { role -> SimpleGrantedAuthority(role.name!!.name) }.collect(Collectors.toList())

            return UserPrincipal(
                    user.id!!,
                    user.email,
                    user.password,
                    authorities
            )
        }
    }

    override fun getUsername(): String {
        return email
    }


    override fun getAuthorities(): Collection<GrantedAuthority> {
        return authorities
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}