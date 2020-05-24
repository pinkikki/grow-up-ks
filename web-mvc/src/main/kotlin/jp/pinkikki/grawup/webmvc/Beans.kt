package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.application.BabyHandler
import jp.pinkikki.grawup.webmvc.application.LifeHandler
import jp.pinkikki.grawup.webmvc.application.TaskHandler
import jp.pinkikki.grawup.webmvc.framework.RequestLogging
import jp.pinkikki.grawup.webmvc.infrastructure.life.TaskRepositoryImpl
import jp.pinkikki.grawup.webmvc.usecase.TaskUseCase
import org.springframework.context.support.beans

val beans = beans {
    bean<LifeHandler>()
    bean<BabyHandler>()
    bean<TaskHandler>()
    bean<TaskRepositoryImpl>()
    bean<TaskUseCase>()
    bean<RequestLogging>()
    bean<Router>()
    bean { ref<Router>().routes() }
    bean<LifeRouter>()
    bean<BabyRouter>()
    bean<TaskRouter>()
}
