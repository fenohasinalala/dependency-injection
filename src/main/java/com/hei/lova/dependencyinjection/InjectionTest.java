package com.hei.lova.dependencyinjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages ="com.hei.lova.dependencyinjection" )
//@Configuration
@Component
public class InjectionTest {
    /*@Autowired
    private static ConcreteClass1 concreteClass1;

     */

    static ConcreteClass1 concreteClass1 = new ConcreteClass1();
    static ConcreteClass2 concreteClass2 = new ConcreteClass2();

    public static void main(String[] args){
        concreteClass1.getConcreteDependance1().methode();
        concreteClass2.getConcreteDependance2().methode();
    }
}
