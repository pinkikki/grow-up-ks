package jp.pinkikki.grawup.webmvc.application

import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.ServerResponse.ok
import javax.validation.ConstraintViolation
import javax.validation.ConstraintViolationException
import javax.validation.Validator

class LifeHandler(private val validator: Validator) {
    fun get(request: ServerRequest): ServerResponse {
        return ok().body("\"test\": \"test\"")
    }

    fun save(request: ServerRequest): ServerResponse {
        val form = request.body(LifeForm::class.java)
        val result: Set<ConstraintViolation<LifeForm>> = validator.validate(form)
        if (result.isNotEmpty()) {
            throw ConstraintViolationException(result)
        }
        return ok().body("\"test\": \"post success\"")
    }
}
