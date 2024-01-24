package com.mk.domain.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class Address(
    @Id
    @GeneratedValue(generator = "UUID") val id: UUID? = null,
    val city: String,
    val country: String,
    val province: String,
    val line1: String,
    val line2: String? = null,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null
) {

    companion object {
        fun createAddress(
            city: String,
            country: String,
            province: String,
            line1: String,
            line2: String? = null
        ): Address {
            return Address(city = city, country = country, province = province, line1 = line1, line2 = line2)
        }
    }
}
