package com.mk.domain.repo

import com.mk.domain.model.user.User
import java.util.Optional

interface UserRepository {

    fun findById(id: Long): Optional<User>
    fun save(user: User): User

}