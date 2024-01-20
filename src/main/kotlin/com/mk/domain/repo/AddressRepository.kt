package com.mk.domain.repo

import com.mk.domain.model.common.Address
import java.util.*

interface AddressRepository {


    fun findById(id: Long): Optional<Address>
    fun save(address: Address): Address

}