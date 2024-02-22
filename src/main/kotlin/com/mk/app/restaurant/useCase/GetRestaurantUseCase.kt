package com.mk.app.restaurant.useCase

import com.mk.app.foodie.result.GetFoodieResult
import com.mk.domain.model.Foodie
import java.util.*

interface GetRestaurantUseCase {

    fun get(id: UUID): GetFoodieResult

    fun getAll(): List<Foodie>


}
