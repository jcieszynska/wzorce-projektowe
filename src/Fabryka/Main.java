package Fabryka;

import Fabryka.Factory;
import Fabryka.UnitFactory;
import Fabryka.UnitType;

public class Main {

    public static void main(String[] args) {
        Factory unitFactory = new UnitFactory();
        System.out.println(unitFactory.createUnit(UnitType.TANK));
        System.out.println(unitFactory.createUnit(UnitType.SOLDIER));
    }
}
