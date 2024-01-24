package com.mk.app.foodie.service

import com.mk.app.foodie.useCase.DeleteFoodieUseCase
import com.mk.app.foodie.useCase.GetFoodieUseCase
import com.mk.app.foodie.useCase.UpsertFoodieUseCase
import com.mk.app.model.command.UpsertFoodieUserCommand
import com.mk.app.model.result.DeleteFoodieResult
import com.mk.app.model.result.FoodieUpsertResult
import com.mk.app.model.result.GetFoodieResult
import com.mk.app.model.result.UpsertError
import com.mk.domain.model.Address
import com.mk.domain.model.Foodie
import com.mk.domain.model.User
import com.mk.domain.repo.AddressRepository
import com.mk.domain.repo.FoodieRepository
import com.mk.domain.repo.RestaurantRepository
import com.mk.domain.repo.UserRepository
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Singleton
import java.util.*

@Singleton
open class FoodieService(
    private val userRepo: UserRepository,
    private val foodieRepo: FoodieRepository,
    private val addressRepo: AddressRepository,
    private val restaurantRepo: RestaurantRepository
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
    override fun upsert(command: UpsertFoodieUserCommand): FoodieUpsertResult {
        val user = userRepo.save(User.createUser(command.username, command.email, command.password));
        val address = addressRepo.save( Address.createAddress(command.city, command.country, command.province,
            command.line1, command.line2));
        val foodie = foodieRepo.save(Foodie.createFoodie(command.mainCityUUID, address, user.id, address.id));
        return FoodieUpsertResult.Success(foodie);

    }


}