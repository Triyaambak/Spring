package com.Spring.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    public void compile() {
        System.out.println("I am using Macbook laptop");
    }
}
