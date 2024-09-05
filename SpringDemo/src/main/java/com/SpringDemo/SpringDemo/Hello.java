package com.SpringDemo.SpringDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String greet() {
        return "Hello , Welcome to Sample Spring project";
    }

    @RequestMapping("/confirm")
    public String confirm() {
        return "I am learning Spring";
    }
}
