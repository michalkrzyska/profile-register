package com.mk.domain.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Foodie(
    @Id @GeneratedValue val id: UUID? = null,
    val mainCityUUID: UUID,
    val address: Address,
    val userId: UUID?,
    val addressId: UUID?,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null
) {
    companion object {
        fun createFoodie(mainCityUUID: UUID, address: Address, userId: UUID?, addressId: UUID?): Foodie {
            return Foodie(mainCityUUID = mainCityUUID, address = address, userId = userId, addressId = addressId)
        }
    }

}