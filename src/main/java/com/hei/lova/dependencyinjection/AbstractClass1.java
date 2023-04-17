package com.hei.lova.dependencyinjection;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractClass1 {
    private ConcreteDependance1 concreteDependance1;
    private ConcreteDependance2 concreteDependance2;

    public void abstractMethode() {
        concreteDependance1.methode();
        concreteDependance2.methode();
    }
}
