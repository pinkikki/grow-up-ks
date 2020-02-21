package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.application.AnswerHandler
import org.springframework.web.servlet.function.router

class AnswerRouter(private val answerHandler: AnswerHandler) {
    fun routes() = router {
        "answer".nest {
            GET("/", answerHandler::get)
        }
    }
}
