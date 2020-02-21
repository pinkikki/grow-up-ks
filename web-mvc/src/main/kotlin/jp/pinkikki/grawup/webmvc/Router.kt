package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.framework.RequestLogging

class Router(private val requestLogging: RequestLogging, private val questionRouter: QuestionRouter, private val answerRouter: AnswerRouter) {

    fun routes() = questionRouter.routes().and(answerRouter.routes()).filter(requestLogging::filter)
}
