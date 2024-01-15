package com.mk.app.foodie.useCase

import com.mk.app.foodie.result.DeleteFoodieResult
import java.util.*


interface DeleteFoodieUseCase {
    fun delete(id: UUID): DeleteFoodieResult

}
