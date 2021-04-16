package com.company.Dekorator;


public class Product implements Component {
    @Override
    public void operation() {
        System.out.println("Product.operation()");
    }
}
