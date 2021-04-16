package com.company.Dekorator;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        DecoratorA d1 = new DecoratorA();
        DecoratorB d2 = new DecoratorB();

        d2.setComponent(product);
        d1.setComponent(d2);

        d1.operation();
    }
}
