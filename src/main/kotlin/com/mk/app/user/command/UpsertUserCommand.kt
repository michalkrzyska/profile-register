package com.mk.app.user.command

import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable.Deserializable
import java.util.*

@Introspected
@Deserializable
data class UpsertUserCommand(
    val userId: UUID?,
    val username: String,
    val email: String,
    val password: String,
)
