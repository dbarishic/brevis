package com.dbarishic.brevis.domain.user

import com.dbarishic.brevis.domain.Role.Role
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(@Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                val id: Long?, @Column(name = "email")
                var email: String, @Column(name = "password")
                var password: String,
                @ManyToMany(fetch = FetchType.LAZY)
                @JoinTable(name = "user_roles",
                        joinColumns = [JoinColumn(name = "user_id")],
                        inverseJoinColumns = [JoinColumn(name = "role_id")])
                val roles: Set<Role>)