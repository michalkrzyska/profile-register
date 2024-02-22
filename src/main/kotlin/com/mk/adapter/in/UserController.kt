package com.mk.adapter.`in`

import com.mk.app.foodie.command.UpsertFoodieCommand
import com.mk.app.foodie.result.DeleteFoodieResult
import com.mk.app.foodie.result.GetFoodieResult
import com.mk.app.foodie.result.UpsertFoodieResult
import com.mk.app.foodie.useCase.DeleteFoodieUseCase
import com.mk.app.foodie.useCase.GetFoodieUseCase
import com.mk.app.foodie.useCase.UpsertFoodieUseCase
import com.mk.app.user.command.UpsertUserCommand
import com.mk.app.user.result.UpsertUserResult
import com.mk.app.user.useCase.UpsertUserUseCase
import com.mk.domain.model.Foodie
import io.micronaut.http.annotation.*
import java.util.*

@Controller("/user")
class UserController(
    private val upsertUserUseCase: UpsertUserUseCase,
) {

    @Post
    fun upsert(@Body command: UpsertUserCommand): UpsertUserResult {
        return upsertUserUseCase.upsert(command);
    }
}
