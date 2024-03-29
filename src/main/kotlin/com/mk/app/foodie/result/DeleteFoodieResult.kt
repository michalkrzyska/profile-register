package com.mk.app.foodie.result

import com.mk.domain.model.Foodie

sealed class DeleteFoodieResult {
    data class Success(val foodie: Foodie) : GetFoodieResult()
    data class Failure(val getFoodieError: GetFoodieError) : GetFoodieResult()
}

sealed class DeleteFoodieError {
    //todo add another
    data class NotFound(val errorMessage: String) : GetFoodieError()
}