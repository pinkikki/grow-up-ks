package jp.pinkikki.grawup.webmvc.application

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.ServerResponse.ok

class AnswerHandler {
    private val logger: Logger = LoggerFactory.getLogger(AnswerHandler::class.java)

    fun get(request: ServerRequest): ServerResponse {
        return ok().body("\"test\": \"test\"")
    }
}
