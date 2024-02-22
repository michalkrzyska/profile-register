package com.mk.app.user.result

import com.mk.domain.model.User

sealed class UpsertUserResult {
    data class Success(val foodie: User) : UpsertUserResult()
    data class Failure(val upsertError: UserUpsertError) : UpsertUserResult()
}

sealed class UserUpsertError {
    //todo add another
    data class Validation(val errorMessage: String) : UserUpsertError()
    data class Database(val errorMessage: String) : UserUpsertError()
    data class Email(val errorMessage: String) : UserUpsertError()
}