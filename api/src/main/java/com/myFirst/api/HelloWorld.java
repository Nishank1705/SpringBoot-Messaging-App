package com.myFirst.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    @GetMapping(value = {"/uc1", "/hello"})
    public String sayHello() {
        return "Hello, World!";
    }

    //UC2 Request parameter
    @GetMapping("/input")
    public String sayHello(@RequestParam(defaultValue = "Mark") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    //uc3 Parameter using path variable
    @GetMapping("/query/{name}")
    public String display(@PathVariable String name){
        return "Hello "+ name+ " from BridgeLabz";
    }
}