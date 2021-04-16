package com.company.Prototyp;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype px = new PrototypeX(1);
        Prototype py = new PrototypeY(2);

        System.out.println(px.clone());
        System.out.println(py.clone());
    }
}
