package jp.pinkikki.grawup.webmvc.framework

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.servlet.function.HandlerFunction
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse

class RequestLogging {
    private val logger: Logger = LoggerFactory.getLogger(RequestLogging::class.java)

    fun filter(request: ServerRequest, next: HandlerFunction<ServerResponse>): ServerResponse {
        request.remoteAddress().ifPresent { r -> logger.info(r.hostName) }
        return next.handle(request)
    }
}
