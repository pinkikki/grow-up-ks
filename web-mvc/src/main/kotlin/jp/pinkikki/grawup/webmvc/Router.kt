package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.framework.RequestLogging

class Router(
    private val requestLogging: RequestLogging,
    private val lifeRouter: LifeRouter,
    private val babyRouter: BabyRouter,
    private val taskRouter: TaskRouter
) {

    fun routes() = lifeRouter.routes().and(babyRouter.routes()).and(taskRouter.routes()).filter(requestLogging::filter)
}
