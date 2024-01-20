package com.mk.app.foodie.useCase

import com.mk.app.model.result.DeleteFoodieResult
import java.util.*


interface DeleteFoodieUseCase {
    fun delete(id: UUID): DeleteFoodieResult

}
