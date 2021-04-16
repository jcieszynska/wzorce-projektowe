package com.company.Pelnomocnik;

public class RealSubject implements Subject {

    @Override
    public void query() {
        System.out.println("Called SpecificItem.Query()");
    }
}
