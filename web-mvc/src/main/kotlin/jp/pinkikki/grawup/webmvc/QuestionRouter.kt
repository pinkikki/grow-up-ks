package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.application.QuestionHandler
import org.springframework.web.servlet.function.router

class QuestionRouter(private val questionHandler: QuestionHandler) {
    fun routes() = router {
//        "/".nest {
//            "question".nest {
//                GET("/", questionHandler::get)
//            }
//        }
        "question".nest {
            GET("/", questionHandler::get)
        }
    }
}
