package com.mk.adapter.foodie.`in`

import com.mk.app.model.result.DeleteFoodieResult
import com.mk.app.model.result.FoodieUpsertResult
import com.mk.app.model.result.GetFoodieResult
import com.mk.app.foodie.useCase.DeleteFoodieUseCase
import com.mk.app.foodie.useCase.GetFoodieUseCase
import com.mk.app.foodie.useCase.UpsertFoodieUseCase
import com.mk.app.model.command.UpsertFoodieUserCommand
import com.mk.domain.model.Foodie
import io.micronaut.http.annotation.*
import java.util.*

@Controller("/foodie")
class FoodieController(
    private val upsertFoodieUseCase: UpsertFoodieUseCase,
    private val getFoodieUseCase: GetFoodieUseCase,
    private val deleteFoodieUseCase: DeleteFoodieUseCase
) {

    @Post
    fun upsert(@Body command: UpsertFoodieUserCommand): FoodieUpsertResult {
        return upsertFoodieUseCase.upsert(command);
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
