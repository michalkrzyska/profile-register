package com.mk.app.model.result

import com.mk.domain.model.Foodie

sealed class GetFoodieResult {
    data class Success(val foodie: Foodie) : GetFoodieResult()
    data class Failure(val getFoodieError: GetFoodieError) : GetFoodieResult()
}

sealed class GetFoodieError {
    //todo add another
    data class NotFound(val errorMessage: String) : GetFoodieError()
}