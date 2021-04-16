package com.company;
abstract class KlasaAbstarkcyjna {
    public abstract void ZrobCos();
    public abstract void JakasInnaMetoda();

    public void MetodaSzablonowa() {
        ZrobCos();
        JakasInnaMetoda();
        System.out.println("");
    }
}

class SpecyficznaKlasaA extends KlasaAbstarkcyjna {
    @Override
    public void JakasInnaMetoda() {
        System.out.println("SpecyficznaKlasaA.JakasInnaMetoda()");
    }

    @Override
    public void ZrobCos() {
        System.out.println("SpecyficznaKlasaA.ZrobCos()");
    }
}

class SpecyficznaKlasaB extends KlasaAbstarkcyjna {
    @Override
    public void JakasInnaMetoda() {
        System.out.println("SpecyficznaKlasaB.JakasInnaMetoda()");
    }

    @Override
    public void ZrobCos() {
        System.out.println("SpecyficznaKlasaB.ZrobCos()");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        KlasaAbstarkcyjna aA = new SpecyficznaKlasaA();
        aA.MetodaSzablonowa();

        KlasaAbstarkcyjna aB = new SpecyficznaKlasaB();
        aB.MetodaSzablonowa();

    }
}
