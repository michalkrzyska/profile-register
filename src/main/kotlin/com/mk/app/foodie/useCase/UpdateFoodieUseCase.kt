package com.mk.app.foodie.useCase

import com.mk.app.foodie.result.FoodieRegistrationResult
import com.mk.domain.foodie.Foodie


interface UpdateFoodieUseCase {

    fun update(foodie: Foodie): FoodieRegistrationResult

}
