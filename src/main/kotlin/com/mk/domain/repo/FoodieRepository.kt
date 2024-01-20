package com.mk.domain.repo

import com.mk.domain.model.foodie.Foodie
import java.util.*

interface FoodieRepository {


    fun findById(id: Long): Optional<Foodie>
    fun save(foodie: Foodie): Foodie

}