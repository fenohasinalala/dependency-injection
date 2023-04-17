package com.hei.lova.dependencyinjection;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public abstract class AbstractClass1 {
    private ConcreteDependance1 concreteDependance1;
    private ConcreteDependance2 concreteDependance2;

    public AbstractClass1(ConcreteDependance1 dep1, ConcreteDependance2 dep2) {
        this.concreteDependance1 = dep1;
        this.concreteDependance2 = dep2;
    }
    public void abstractMethode() {
        concreteDependance1.methode();
        concreteDependance2.methode();
    }
}
