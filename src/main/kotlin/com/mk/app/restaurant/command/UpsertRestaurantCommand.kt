package com.mk.app.restaurant.command

import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable.Deserializable
import java.util.*

@Introspected
@Deserializable
data class UpsertRestaurantCommand(
    val userId: UUID?,
    val name: String,
    val email: String,
    val ordinal: Int,
    val password: String,
    val mainCityUUID: UUID,
    val city: String,
    val country: String,
    val province: String,
    val line1: String,
    val line2: String
)
