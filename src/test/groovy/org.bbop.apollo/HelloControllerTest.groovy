package org.bbop.apollo

//import static org.junit.jupiter.api.Assertions.assertEquals
//import static org.junit.jupiter.api.Assertions.assertNotNull

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import org.junit.Test
import spock.lang.Specification

//import org.junit.jupiter.api.Test

import javax.inject.Inject

@MicronautTest
public class HelloControllerTest extends Specification{

    @Inject
    @Client("/")
    RxHttpClient client

    @Test
    public void testHello() {

        when:
        HttpRequest<String> request = HttpRequest.GET("/hello2")
        String body = client.toBlocking().retrieve(request)

        then:
        assert body != null
        assert body == "Hello World"
    }

    @Test
    public void testPuppy() {

        when:
        HttpRequest<String> request = HttpRequest.GET("/hello2/puppy")
        String body = client.toBlocking().retrieve(request)

        then:
        assert body != null
        assert body == "Hello Puppy"
    }
}