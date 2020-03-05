package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.application.BabyHandler
import org.springframework.web.servlet.function.router

class BabyRouter(private val babyHandler: BabyHandler) {
    fun routes() = router {
        "answer".nest {
            GET("/", babyHandler::get)
        }
    }
}
