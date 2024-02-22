package com.mk.app.restaurant.useCase

import com.mk.app.foodie.result.UpsertRestaurantResult
import com.mk.app.restaurant.command.UpsertRestaurantCommand


interface UpsertRestaurantUseCase {

    fun upsert(command: UpsertRestaurantCommand): UpsertRestaurantResult


}
