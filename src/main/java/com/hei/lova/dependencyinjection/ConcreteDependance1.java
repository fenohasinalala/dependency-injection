package com.hei.lova.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class ConcreteDependance1 {
    public void methode() {
        System.out.println("methode from ConcreteDependance1...");
    }
}
