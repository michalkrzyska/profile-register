package com.mk.domain.model.common

import java.util.*

data class Rating(
    val id: UUID,
    val mark: Float,
    val sumUp: String,
    val desc: String,
    val userId: UUID,
    val restaurantID: UUID,
    val specialMark: UUID,
) {

}
