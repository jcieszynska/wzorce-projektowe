package com.company.Fabryka;

public abstract class Unit {
    private int hp;
    private int experience;
    private int power;

    public Unit(int hp, int experience, int power) {
        this.hp = hp;
        this.experience = experience;
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return  this.getClass().getName() + " {" +
                "hp=" + hp +
                ", experience=" + experience +
                ", power=" + power +
                '}';
    }
}
