package com.frepi.helloworld;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class HelloWorldController {
    @GetMapping(path = "/hello-world")
    public HelloWorld helloWorld() {
        return new HelloWorld("from Anim");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorld helloWroldWithPathVariable(@PathVariable String name) {
        return new HelloWorld(String.format("Hello World, %s", name));
    }


}
