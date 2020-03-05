package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.framework.RequestLogging

class Router(private val requestLogging: RequestLogging, private val lifeRouter: LifeRouter, private val babyRouter: BabyRouter) {

    fun routes() = lifeRouter.routes().and(babyRouter.routes()).filter(requestLogging::filter)
}
