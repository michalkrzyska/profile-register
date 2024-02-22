package com.mk.app.user.service

import com.mk.app.user.command.UpsertUserCommand
import com.mk.app.user.result.UpsertUserResult
import com.mk.app.user.useCase.UpsertUserUseCase
import com.mk.domain.model.User
import com.mk.domain.repo.UserRepository
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Singleton

@Singleton
open class UserService(
    private val userRepo: UserRepository,
) : UpsertUserUseCase {


    @Transactional
    override fun upsert(command: UpsertUserCommand): UpsertUserResult {
        val user = userRepo.save(User.createUser(command.username, command.email, command.password));
        return UpsertUserResult.Success(user);

    }


}