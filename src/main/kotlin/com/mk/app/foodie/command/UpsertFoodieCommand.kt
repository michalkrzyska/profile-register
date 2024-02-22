package com.mk.app.foodie.command

import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable.Deserializable
import java.util.*

@Introspected
@Deserializable
data class UpsertFoodieCommand(
    val userId: UUID?,
    val username: String,
    val email: String,
    val password: String,
    val mainCityUUID: UUID,
    val city: String,
    val country: String,
    val province: String,
    val line1: String,
    val line2: String
)
