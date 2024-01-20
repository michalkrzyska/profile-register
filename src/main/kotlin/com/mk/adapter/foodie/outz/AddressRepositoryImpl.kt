package com.mk.adapter.foodie.outz


import com.mk.domain.model.common.Address
import com.mk.domain.repo.AddressRepository
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
abstract class AddressRepositoryImpl : AddressRepository, JpaRepository<Address, Long> {

}
