package jp.pinkikki.grawup.webmvc.application

import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.ServerResponse.ok

class QuestionHandler {
    fun get(request: ServerRequest): ServerResponse {
        return ok().body("\"test\": \"test\"")
    }
}
