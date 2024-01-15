package com.mk.app.foodie.service

import com.mk.app.foodie.result.FoodieRegistrationResult
import com.mk.app.foodie.result.GetFoodieResult
import com.mk.app.foodie.useCase.DeleteFoodieUseCase
import com.mk.app.foodie.useCase.GetFoodieUseCase
import com.mk.app.foodie.useCase.RegisterFoodieUseCase
import com.mk.app.foodie.useCase.UpdateFoodieUseCase
import com.mk.domain.foodie.Foodie
import jakarta.inject.Singleton
import java.util.*

@Singleton
class FoodieService : RegisterFoodieUseCase, GetFoodieUseCase, UpdateFoodieUseCase, DeleteFoodieUseCase {
    override fun register(foodie: Foodie): FoodieRegistrationResult {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Foodie> {
        TODO("Not yet implemented")
    }

    override fun get(id: UUID): GetFoodieResult {
        TODO("Not yet implemented")
    }

    override fun delete(id: UUID): FoodieRegistrationResult {
        TODO("Not yet implemented")
    }

    override fun update(foodie: Foodie): FoodieRegistrationResult {
        TODO("Not yet implemented")
    }


}