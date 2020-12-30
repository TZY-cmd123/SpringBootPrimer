package com.example.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloTest {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }



    @RequestMapping("/")
    public String hello(String name){
        return "Hello"+name;
    }
}
