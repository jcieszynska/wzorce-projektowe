package com.company.FabrykaAbstrakcyjna;

public class Main {
    public static void main(String[] args) {
        Factory redFactory = new RedFactory();
        Factory blueFactory = new BlueFactory();

        System.out.println(redFactory.createInfantry(UnitType.SOLDIER));
        System.out.println(blueFactory.createInfantry(UnitType.SOLDIER));

        System.out.println(redFactory.creatGroundUnit(UnitType.TANK));
        System.out.println(blueFactory.creatGroundUnit(UnitType.TANK));

        System.out.println(redFactory.createAirUnit(UnitType.HELICOPTER));
        System.out.println(blueFactory.createAirUnit(UnitType.HELICOPTER));
    }
}
