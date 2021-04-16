package com.company.Pelnomocnik;

public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void query() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.query();
    }
}
