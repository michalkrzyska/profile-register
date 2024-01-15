package com.mk.domain.common

import java.util.UUID


data class AddressDetails(
    var id: UUID,
    val city: String,
    val country: String,
    val province: String,
    val line1: String,
    val line2: String
) {

}
