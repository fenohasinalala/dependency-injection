package com.hei.lova.dependencyinjection;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter

public class ConcreteClass1 extends AbstractClass1 {
    public ConcreteClass1(ConcreteDependance1 dep1, ConcreteDependance2 dep2) {
        super(dep1, dep2);
    }
    public ConcreteClass1() {
        super(new ConcreteDependance1(), new ConcreteDependance2());
    }

}
