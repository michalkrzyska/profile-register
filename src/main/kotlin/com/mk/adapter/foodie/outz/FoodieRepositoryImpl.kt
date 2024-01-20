package com.mk.adapter.foodie.outz


import com.mk.domain.model.foodie.Foodie
import com.mk.domain.repo.FoodieRepository
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
abstract class FoodieRepositoryImpl : FoodieRepository, JpaRepository<Foodie, Long> {

}
