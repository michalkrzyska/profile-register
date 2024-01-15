package com.mk.adapter.foodie.`in`

import com.mk.app.foodie.result.DeleteFoodieResult
import com.mk.app.foodie.result.FoodieRegistrationResult
import com.mk.app.foodie.result.GetFoodieResult
import com.mk.app.foodie.useCase.DeleteFoodieUseCase
import com.mk.app.foodie.useCase.GetFoodieUseCase
import com.mk.app.foodie.useCase.RegisterFoodieUseCase
import com.mk.app.foodie.useCase.UpdateFoodieUseCase
import com.mk.domain.foodie.Foodie
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import java.util.*

@Controller("/foodie")
class FoodieController(
    private val registerFoodieUseCase: RegisterFoodieUseCase,
    private val getFoodieUseCase: GetFoodieUseCase,
    private val updateFoodieUseCase: UpdateFoodieUseCase,
    private val deleteFoodieUseCase: DeleteFoodieUseCase
) {

    @Post
    fun upsert(@Body foodie: Foodie): FoodieRegistrationResult {
        return if (foodie.id == null) {
            registerFoodieUseCase.register(foodie);
        } else {
            updateFoodieUseCase.update(foodie);
        }
    }

    @Get("/{id}")
    fun getFoodie(id: UUID): GetFoodieResult {
        return getFoodieUseCase.get(id)
    }

    @Get
    fun getAllFoodies(): List<Foodie> {
        return getFoodieUseCase.getAll()
    }

    @Delete("/{id}")
    fun deleteFoodie(id: UUID): DeleteFoodieResult {
        return deleteFoodieUseCase.delete(id)
    }
}
