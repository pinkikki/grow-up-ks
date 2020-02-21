package jp.pinkikki.grawup.webmvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class WebMvcApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .sources(WebMvcApplication::class.java)
            .initializers(beans)
            .run(*args)
}
