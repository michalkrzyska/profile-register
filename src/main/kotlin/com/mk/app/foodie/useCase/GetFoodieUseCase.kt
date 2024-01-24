package com.mk.app.foodie.useCase

import com.mk.app.model.result.GetFoodieResult
import com.mk.domain.model.Foodie
import java.util.*

interface GetFoodieUseCase {

    fun get(id: UUID): GetFoodieResult

    fun getAll(): List<Foodie>


}
