package com.mk.domain.model.common

import java.util.UUID


data class Address(
    var id: UUID? = null,
    val city: String,
    val country: String,
    val province: String,
    val line1: String,
    val line2: String? = null
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
