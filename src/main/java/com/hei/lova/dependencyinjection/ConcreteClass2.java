package com.hei.lova.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1 {

    public ConcreteClass2(ConcreteDependance1 dep1, ConcreteDependance2 dep2) {
        super(dep1, dep2);
    }

    public ConcreteClass2() {
        super(new ConcreteDependance1(), new ConcreteDependance2());
    }
}
