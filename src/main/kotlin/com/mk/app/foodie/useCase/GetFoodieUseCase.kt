package com.mk.app.foodie.useCase

import com.mk.app.foodie.result.GetFoodieResult
import com.mk.domain.foodie.Foodie
import java.util.*

interface GetFoodieUseCase {

    fun get(id: UUID): GetFoodieResult

    fun getAll(): List<Foodie>


}
