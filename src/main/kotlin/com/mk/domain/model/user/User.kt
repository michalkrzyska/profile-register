package com.mk.domain.model.user

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
    @Id @GeneratedValue val id: Long? = null,
    val username: String,
    val email: String,
    val password: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null
) {
    companion object {
        fun createUser(username: String, email: String, rawPassword: String): User {
            val hashedPassword = hashPassword(rawPassword)
            return User(username = username, email = email, password = hashedPassword)
        }

        private fun hashPassword(rawPassword: String): String {
            return rawPassword;
        }
    }
}