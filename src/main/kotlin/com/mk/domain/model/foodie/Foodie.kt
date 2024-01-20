package com.mk.domain.model.foodie

import com.mk.domain.model.common.Address
import com.mk.domain.model.common.Rating
import com.mk.domain.model.restaurant.Restaurant
import com.mk.domain.model.user.User
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Foodie(
    @Id @GeneratedValue val id: Long? = null,
    val mainCityUUID: UUID? = null,
    val address: Address,
    val ratings: List<Rating>? = null,
    val favourites: List<Restaurant>? = null,
    val tags: List<FoodieTag>? = null,
    val user: User
) {
    companion object {
        fun createFoodie(mainCityUUID: UUID?, address: Address, user: User): Foodie {
            return Foodie(mainCityUUID = mainCityUUID, address = address, user = user)
        }
    }

}