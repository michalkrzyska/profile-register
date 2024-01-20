package com.mk.app.foodie.service

import com.mk.app.foodie.useCase.DeleteFoodieUseCase
import com.mk.app.foodie.useCase.GetFoodieUseCase
import com.mk.app.foodie.useCase.UpsertFoodieUseCase
import com.mk.app.model.command.UpsertFoodieUserCommand
import com.mk.app.model.result.DeleteFoodieResult
import com.mk.app.model.result.FoodieUpsertResult
import com.mk.app.model.result.GetFoodieResult
import com.mk.app.model.result.UpsertError
import com.mk.domain.model.common.Address
import com.mk.domain.model.foodie.Foodie
import com.mk.domain.model.user.User
import com.mk.domain.repo.AddressRepository
import com.mk.domain.repo.FoodieRepository
import com.mk.domain.repo.UserRepository
import jakarta.inject.Singleton
import java.util.*

@Singleton
class FoodieService(
    private val userRepo: UserRepository,
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

    override fun upsert(command: UpsertFoodieUserCommand): FoodieUpsertResult {
        val user = User.createUser(command.username, command.email, command.password);
        val address =
            Address.createAddress(command.city, command.country, command.province, command.line1, command.line2)
        val foodie = Foodie.createFoodie(command.mainCityUUID, address, user);
        saveToRepos(user, foodie, address);
        //todo - please change
        return FoodieUpsertResult.Failure(UpsertError.Email("eeaa"));

    }

    private fun saveToRepos(user: User, foodie: Foodie, addressDetails: Address) {
        userRepo.save(user);
        foodieRepo.save(foodie);
        addressRepo.save(addressDetails)
    }


}