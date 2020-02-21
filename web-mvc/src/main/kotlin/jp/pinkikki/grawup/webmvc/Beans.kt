package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.application.AnswerHandler
import jp.pinkikki.grawup.webmvc.application.QuestionHandler
import jp.pinkikki.grawup.webmvc.framework.RequestLogging
import org.springframework.context.support.beans

val beans = beans {
    bean<QuestionHandler>()
    bean<AnswerHandler>()
    bean<RequestLogging>()
    bean<Router>()
    bean { ref<Router>().routes() }
    bean<QuestionRouter>()
    bean { ref<QuestionRouter>().routes() }
    bean<AnswerRouter>()
    bean { ref<AnswerRouter>().routes() }

}
