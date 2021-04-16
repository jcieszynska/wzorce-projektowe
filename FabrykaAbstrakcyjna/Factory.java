package com.company.FabrykaAbstrakcyjna;

public interface Factory {
    Unit createInfantry(UnitType unitType);
    Unit creatGroundUnit(UnitType unitType);
    Unit createAirUnit(UnitType unitType);
}
