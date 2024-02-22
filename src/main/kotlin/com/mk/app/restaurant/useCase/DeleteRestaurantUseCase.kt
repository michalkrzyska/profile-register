package com.mk.app.restaurant.useCase

import com.mk.app.foodie.result.DeleteFoodieResult
import java.util.*


interface DeleteRestaurantUseCase {
    fun delete(id: UUID): DeleteFoodieResult

}
