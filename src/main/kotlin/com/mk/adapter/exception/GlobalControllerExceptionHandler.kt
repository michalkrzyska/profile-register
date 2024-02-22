package com.mk.adapter.exception

import com.mk.app.exception.NullIDValidationException
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Error
import io.micronaut.http.hateoas.JsonError
import jakarta.inject.Singleton

@Singleton
class GlobalExceptionHandler {

    @Error(global = true, exception = NullIDValidationException::class)
    fun handleCustomValidationException(request: HttpRequest<*>, exception: NullIDValidationException): HttpResponse<JsonError> {
        val errorMessage = "Validation failed: ${exception.message} - Path: ${request.path}"
        val error = JsonError(errorMessage)
        return HttpResponse.badRequest<JsonError>().body(error)
    }
}