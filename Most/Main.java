package com.company.Most;

public class Main {
    public static void main(String[] args) {
        DerivativeAbstraction derivativeAbstraction = new DerivativeAbstraction();

        derivativeAbstraction.setImplementation(new SpecificImplementation());
        derivativeAbstraction.implementationMethod();

        derivativeAbstraction.setImplementation(new DifferentImplementation());
        derivativeAbstraction.implementationMethod();
    }
}
