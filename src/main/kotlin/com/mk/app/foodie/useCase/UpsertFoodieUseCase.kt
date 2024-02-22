package com.mk.app.foodie.useCase

import com.mk.app.foodie.command.UpsertFoodieCommand
import com.mk.app.foodie.result.UpsertFoodieResult


interface UpsertFoodieUseCase {

    fun upsert(command: UpsertFoodieCommand): UpsertFoodieResult


}
