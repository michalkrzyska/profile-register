package com.mk.domain.repo

import com.mk.domain.model.Address
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface AddressRepository : JpaRepository<Address, UUID> {}