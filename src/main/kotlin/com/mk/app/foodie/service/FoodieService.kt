package com.mk.app.foodie.service

import com.mk.app.exception.NullIDValidationException
import com.mk.app.foodie.command.UpsertFoodieCommand
import com.mk.app.foodie.result.DeleteFoodieResult
import com.mk.app.foodie.result.GetFoodieResult
import com.mk.app.foodie.result.UpsertFoodieResult
import com.mk.app.foodie.useCase.DeleteFoodieUseCase
import com.mk.app.foodie.useCase.GetFoodieUseCase
import com.mk.app.foodie.useCase.UpsertFoodieUseCase
import com.mk.domain.model.Address
import com.mk.domain.model.Foodie
import com.mk.domain.repo.AddressRepository
import com.mk.domain.repo.FoodieRepository
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Singleton
import java.util.*

@Singleton
open class FoodieService(
    private val foodieRepo: FoodieRepository,
    private val addressRepo: AddressRepository
) : UpsertFoodieUseCase, GetFoodieUseCase,
    DeleteFoodieUseCase {

    override fun getAll(): List<Foodie> {
        TODO("Not yet implemented")
    }

    override fun get(id: UUID): GetFoodieResult {
        TODO("Not yet implemented")
    }

    override fun delete(id: UUID): DeleteFoodieResult {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun upsert(command: UpsertFoodieCommand): UpsertFoodieResult {
        val address = addressRepo.save(
            Address.create(
                command.city,
                command.country,
                command.province,
                command.line1,
                command.line2
            )
        )
        val nonNullAddressId = address.id ?: throw NullIDValidationException("Address ID is null after save.")
        val nonNullUserId = command.userId ?: throw NullIDValidationException("User ID is null.")

        val foodie = foodieRepo.save(
            Foodie.createFoodie(command.mainCityUUID, address, nonNullUserId, nonNullAddressId)
        );
        foodieRepo.save(foodie)
        return UpsertFoodieResult.Success(foodie)

    }


}