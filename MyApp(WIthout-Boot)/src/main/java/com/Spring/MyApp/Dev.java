package com.Spring.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Field injection
    // @Autowired
    // private Laptop laptop;

    // Constructor injection
    // private Laptop laptop;
    // public Dev(Laptop laptop) {
    // this.laptop = laptop;
    // }

    // Setter injection
    private Computer comp;

    @Autowired
    @Qualifier("desktop")
    private void setLaptop(Computer comp) {
        this.comp = comp;
    }

    public void build() {
        comp.compile();
        System.out.println("Working on project");
    }
}
