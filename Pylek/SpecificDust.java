package com.company.Pylek;

public class SpecificDust extends Dust {

    public SpecificDust(String name) {
        super(name);
    }

    @Override
    void sampleMethod(int externalData) {
        System.out.println("SpecificDust (" + this.name + "): "+ externalData);
    }
}
