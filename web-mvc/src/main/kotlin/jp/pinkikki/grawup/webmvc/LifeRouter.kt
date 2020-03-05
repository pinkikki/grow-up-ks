package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.application.LifeHandler
import org.springframework.web.servlet.function.router

class LifeRouter(private val lifeHandler: LifeHandler) {
    fun routes() = router {
        "question".nest {
            GET("/", lifeHandler::get)
            POST("/", lifeHandler::save)
        }
    }
}
