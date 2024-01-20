package com.mk.app.model.command

import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable.Deserializable
import java.util.*

@Introspected
@Deserializable
data class UpsertFoodieUserCommand(
    val id: UUID?,
    val username: String,
    val email: String,
    val password: String,
    val mainCityUUID: UUID?,
    val city: String,
    val country: String,
    val province: String,
    val line1: String,
    val line2: String

)
