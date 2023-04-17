package com.example.tdprog3;

import org.springframework.stereotype.Component;

@Component
public class ConcretClass1 extends AbstractClass1 {
    public ConcretClass1(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2) {
        super(concreteDependance1, concreteDependance2);
    }
}
