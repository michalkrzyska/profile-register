package com.mk.app.foodie.result

import com.mk.domain.model.Foodie

sealed class UpsertFoodieResult {
    data class Success(val foodie: Foodie) : UpsertFoodieResult()
    data class Failure(val upsertError: UpsertRestaurantError) : UpsertFoodieResult()
}

sealed class UpsertFoodieError {
    //todo add another
    data class Validation(val errorMessage: String) : UpsertFoodieResult()
    data class Database(val errorMessage: String) : UpsertFoodieResult()
    data class Email(val errorMessage: String) : UpsertFoodieResult()
}