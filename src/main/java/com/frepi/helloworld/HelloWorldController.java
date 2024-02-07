package com.frepi.helloworld;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class HelloWorldController {
    @GetMapping(path = "/hello-world")
    public HelloWorld helloWorld() {
        return new HelloWorld("from Anim");
    }
}
