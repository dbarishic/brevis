package com.dbarishic.brevis.domain.Role

import com.dbarishic.brevis.domain.enumeration.RoleName
import org.hibernate.annotations.NaturalId
import javax.persistence.*

@Entity
@Table(name = "roles")
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    var name: RoleName? = null

    constructor() {

    }

    constructor(name: RoleName) {
        this.name = name
    }

}