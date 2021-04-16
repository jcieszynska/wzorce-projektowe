package com.company.Dekorator;

public class DecoratorA extends Decorator {

    @Override
    public void operation() {
        super.operation();
        additionalFunctionality();
        System.out.println("DecoratorA.operation()");
    }

    void additionalFunctionality()
    {
        System.out.println("Called additional functionality from DecoratorA");
    }
}
