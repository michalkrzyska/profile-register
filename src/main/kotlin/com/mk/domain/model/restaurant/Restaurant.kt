package com.mk.domain.model.restaurant

import com.mk.domain.model.common.Address
import com.mk.domain.model.common.Rating
import com.mk.domain.model.user.User
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Restaurant(
    @Id @GeneratedValue val id: Long? = null,
    val mainCityUUID: UUID,
    val restaurantOrdinal: Int,
    val address: Address,
    val ratings: List<Rating>,
    val tags: List<RestaurantTag>,
    val connectedRestaurants: List<Restaurant>,
    val users: List<User>
) {

}
