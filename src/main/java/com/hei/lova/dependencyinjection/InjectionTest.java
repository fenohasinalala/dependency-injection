package com.hei.lova.dependencyinjection;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages ="com.hei.lova.dependencyinjection" )
@Configuration
@AllArgsConstructor
public class InjectionTest {

    public static void main(String[] args) {
        ConcreteClass1 c1 = new ConcreteClass1();
        ConcreteClass2 concreteClass2;
            //concreteClass2.abstractMethode();
c1.abstractMethode();

    }


}
