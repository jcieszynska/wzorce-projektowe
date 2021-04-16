package com.company.Prototyp;

public abstract class Prototype {
    private final int id;

    public int getId() {
        return id;
    }

    public Prototype(int id) {
        this.id = id;
    }

    public abstract Prototype clone();

    @Override
    public String toString() {
        return this.getClass().toString() + ", id: " + this.getId();
    }
}
