package com.mk.domain.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Restaurant(
    @Id @GeneratedValue val id: UUID? = null,
    val mainCityUUID: UUID,
    val name: String,
    val restaurantOrdinal: Int,
    val addressId: UUID,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null
) {

}
