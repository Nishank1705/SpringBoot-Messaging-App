package com.myFirst.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorld {

    @GetMapping(value = {"/uc1", "/hello"})
    public String sayHello() {
        return "Hello, World!";
    }
}