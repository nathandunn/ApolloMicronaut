package org.bbop.apollo

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello2")
class Hello2Controller {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    String index() {
        return "Hello World";
    }

    @Get("/puppy")
    @Produces(MediaType.TEXT_PLAIN)
    String puppy() {
        return "Hello Puppy";
    }
}
