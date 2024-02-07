package com.frepi;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@RestController
@SpringBootApplication
public class HelloSpring {

    @RequestMapping("/")
    String helloSpring() {
        return "Hello Spring";
    }

    @RequestMapping("/HelloWorld/")
    String helloWorld() {
        return "Hello World";
    }

    public static void main(String [] args) {
        SpringApplication.run(HelloSpring.class, args);
    }
}