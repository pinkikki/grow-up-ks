package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.application.TaskHandler
import org.springframework.web.servlet.function.router

class TaskRouter(private val taskHandler: TaskHandler) {
    fun routes() = router {
        "task".nest {
            GET("/", taskHandler::list)
            POST("/", taskHandler::save)
        }
    }
}
