package com.mk

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/profile-register")
class ProfileRegisterController {

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }
}