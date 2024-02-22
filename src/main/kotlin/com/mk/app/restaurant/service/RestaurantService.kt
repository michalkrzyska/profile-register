package com.mk.app.restaurant.service

import com.mk.app.exception.NullIDValidationException
import com.mk.app.foodie.result.DeleteFoodieResult
import com.mk.app.foodie.result.GetFoodieResult
import com.mk.app.foodie.result.UpsertRestaurantResult
import com.mk.app.restaurant.command.UpsertRestaurantCommand
import com.mk.app.restaurant.useCase.DeleteRestaurantUseCase
import com.mk.app.restaurant.useCase.GetRestaurantUseCase
import com.mk.app.restaurant.useCase.UpsertRestaurantUseCase
import com.mk.domain.model.Address
import com.mk.domain.model.Foodie
import com.mk.domain.model.Restaurant
import com.mk.domain.repo.AddressRepository
import com.mk.domain.repo.RestaurantRepository
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Singleton
import java.util.*

@Singleton
open class RestaurantService(
    private val restaurantRepo: RestaurantRepository,
    private val addressRepo: AddressRepository
) : UpsertRestaurantUseCase, GetRestaurantUseCase,
    DeleteRestaurantUseCase {

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
    override fun upsert(command: UpsertRestaurantCommand): UpsertRestaurantResult {
        val address = addressRepo.save(Address.create(command.city, command.country, command.province, command.line1, command.line2))

        val nonNullAddressId = address.id ?: throw NullIDValidationException("Address ID is null after save.")
        val nonNullUserId = command.userId ?: throw NullIDValidationException("User ID is null.")

        val restaurant = Restaurant.create(command.name, command.ordinal, command.mainCityUUID, nonNullAddressId, nonNullUserId)
        restaurantRepo.save(restaurant)

        return UpsertRestaurantResult.Success(restaurant)
    }
}