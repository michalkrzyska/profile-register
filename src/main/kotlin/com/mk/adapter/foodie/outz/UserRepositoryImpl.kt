package com.mk.adapter.foodie.outz


import com.mk.domain.model.user.User
import com.mk.domain.repo.UserRepository
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
abstract class UserRepositoryImpl : UserRepository, JpaRepository<User, Long> {

}
