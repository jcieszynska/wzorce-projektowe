package com.company.Fabryka;

import com.company.Fabryka.Factory;
import com.company.Fabryka.UnitFactory;
import com.company.Fabryka.UnitType;

public class Main {

    public static void main(String[] args) {
        Factory unitFactory = new UnitFactory();
        System.out.println(unitFactory.createUnit(UnitType.TANK));
        System.out.println(unitFactory.createUnit(UnitType.SOLDIER));
    }
}
