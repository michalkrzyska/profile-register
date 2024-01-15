package com.mk.domain.restaurant

import com.mk.domain.common.AddressDetails
import com.mk.domain.common.Rating
import java.util.*

data class Restaurant(
    val id: UUID,
    val mainCityUUID: UUID,
    val restaurantOrdinal: Int,
    val addressDetails: AddressDetails,
    val ratings: List<Rating>,
    val tags: List<RestaurantTag>,
    val connectedRestaurants: List<Restaurant>
) {

}
