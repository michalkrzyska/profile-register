package com.mk.app.foodie.result

import com.mk.domain.foodie.Foodie

sealed class FoodieRegistrationResult {
    data class Success(val foodie: Foodie) : FoodieRegistrationResult()
    data class Failure(val registrationError: RegistrationError) : FoodieRegistrationResult()
}

sealed class RegistrationError {
    //todo add another
    data class Validation(val errorMessage: String) : RegistrationError()
    data class Database(val errorMessage: String) : RegistrationError()
    data class Email(val errorMessage: String) : RegistrationError()
}