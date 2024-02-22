package com.mk.app.user.useCase

import com.mk.app.user.command.UpsertUserCommand
import com.mk.app.user.result.UpsertUserResult


interface UpsertUserUseCase {
    fun upsert(command: UpsertUserCommand): UpsertUserResult

}
