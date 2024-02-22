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
    val ordinal: Int,
    val addressId: UUID,
    val userId: UUID,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null
) {

    companion object {
        fun create(
            name: String,
            restaurantOrdinal: Int,
            mainCityUUID: UUID,
            addressId: UUID,
            userId: UUID
        ): Restaurant {
            return Restaurant(
                name = name,
                ordinal = restaurantOrdinal,
                mainCityUUID = mainCityUUID,
                addressId = addressId,
                userId = userId
            )
        }
    }

}
