package com.dbarishic.brevis.domain.Role

import com.dbarishic.brevis.domain.enumeration.RoleName
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface RoleRepository: JpaRepository<Role, Long> {
    fun findByName(name: RoleName): Optional<Role>
}