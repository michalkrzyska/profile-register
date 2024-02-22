package com.mk.app.foodie.result

import com.mk.domain.model.Restaurant

sealed class UpsertRestaurantResult {
    data class Success(val restaurant: Restaurant) : UpsertRestaurantResult()
    data class Failure(val upsertError: UpsertRestaurantError) : UpsertRestaurantResult()
}

sealed class UpsertRestaurantError {
    //todo add another
    data class Validation(val errorMessage: String) : UpsertRestaurantError()
    data class Database(val errorMessage: String) : UpsertRestaurantError()
    data class Email(val errorMessage: String) : UpsertRestaurantError()
}