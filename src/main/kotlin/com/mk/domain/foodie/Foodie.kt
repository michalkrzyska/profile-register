package com.mk.domain.foodie

import com.mk.domain.common.AddressDetails
import com.mk.domain.common.Rating
import com.mk.domain.restaurant.Restaurant
import org.jetbrains.annotations.Nullable
import java.util.UUID

data class Foodie(
    val id: UUID?,
    val mainCityUUID: UUID,
    val addressDetails: AddressDetails,
    val ratings: List<Rating>,
    val favourites: List<Restaurant>,
    val tagsL: List<FoodieTag>) {
}