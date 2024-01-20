package com.mk.app.model.result

import com.mk.domain.model.foodie.Foodie

sealed class DeleteFoodieResult {
    data class Success(val foodie: Foodie) : GetFoodieResult()
    data class Failure(val getFoodieError: GetFoodieError) : GetFoodieResult()
}

sealed class DeleteFoodieError {
    //todo add another
    data class NotFound(val errorMessage: String) : GetFoodieError()
}