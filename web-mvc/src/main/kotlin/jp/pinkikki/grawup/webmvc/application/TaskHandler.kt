package jp.pinkikki.grawup.webmvc.application

import jp.pinkikki.grawup.webmvc.usecase.TaskUseCase
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.ServerResponse.created
import org.springframework.web.servlet.function.ServerResponse.ok
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.ConstraintViolation
import javax.validation.ConstraintViolationException
import javax.validation.Validator

class TaskHandler(
    private val validator: Validator,
    private val useCase: TaskUseCase
) {
    fun list(request: ServerRequest): ServerResponse = ok().body(useCase.list())

    fun save(request: ServerRequest): ServerResponse {
        val task = request.body(TaskRequest::class.java)
        val result: Set<ConstraintViolation<TaskRequest>> = validator.validate(task)
        if (result.isNotEmpty()) {
            throw ConstraintViolationException(result)
        }

        val saved = useCase.save(task)
        return created(UriComponentsBuilder.fromUri(request.uri()).path("/{id}").build(saved.id)).build()
    }
}
