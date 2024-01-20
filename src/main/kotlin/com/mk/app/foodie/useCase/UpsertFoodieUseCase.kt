package com.mk.app.foodie.useCase

import com.mk.app.model.command.UpsertFoodieUserCommand
import com.mk.app.model.result.FoodieUpsertResult


interface UpsertFoodieUseCase {

    fun upsert(command: UpsertFoodieUserCommand): FoodieUpsertResult


}
