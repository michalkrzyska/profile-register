package com.mk.app.model.result

import com.mk.domain.model.Foodie

sealed class FoodieUpsertResult {
    data class Success(val foodie: Foodie) : FoodieUpsertResult()
    data class Failure(val upsertError: UpsertError) : FoodieUpsertResult()
}

sealed class UpsertError {
    //todo add another
    data class Validation(val errorMessage: String) : UpsertError()
    data class Database(val errorMessage: String) : UpsertError()
    data class Email(val errorMessage: String) : UpsertError()
}