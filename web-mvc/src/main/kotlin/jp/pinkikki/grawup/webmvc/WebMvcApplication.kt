package jp.pinkikki.grawup.webmvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext

@SpringBootApplication
class WebMvcApplication

//fun main(args: Array<String>) {
//    SpringApplicationBuilder()
//            .sources(WebMvcApplication::class.java)
//            .initializers(beans)
//            .run(*args)
//}
fun main(args: Array<String>) {
    runApplication<WebMvcApplication>(*args)
}

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) = beans.initialize(context)
}
