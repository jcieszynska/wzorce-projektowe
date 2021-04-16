package com.company.Most;

public class Abstraction {
    protected Implementation implementation;

    public void setImplementation(Implementation implementation) {
        this.implementation = implementation;
    }

    protected void implementationMethod() {
        this.implementation.ImplementationMethod();
    }
}
