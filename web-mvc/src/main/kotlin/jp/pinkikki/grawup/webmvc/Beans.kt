package jp.pinkikki.grawup.webmvc

import jp.pinkikki.grawup.webmvc.application.BabyHandler
import jp.pinkikki.grawup.webmvc.application.LifeHandler
import jp.pinkikki.grawup.webmvc.framework.RequestLogging
import org.springframework.context.support.beans

val beans = beans {
    bean<LifeHandler>()
    bean<BabyHandler>()
    bean<RequestLogging>()
    bean<Router>()
    bean { ref<Router>().routes() }
    bean<LifeRouter>()
    bean { ref<LifeRouter>().routes() }
    bean<BabyRouter>()
    bean { ref<BabyRouter>().routes() }

}
