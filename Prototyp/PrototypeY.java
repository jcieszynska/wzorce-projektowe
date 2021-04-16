package com.company.Prototyp;

public class PrototypeY extends Prototype {
    public PrototypeY(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new PrototypeY(this.getId());
    }
}
