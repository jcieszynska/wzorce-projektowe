package com.company.FabrykaAbstrakcyjna;

public class RedFactory implements Factory{

    @Override
    public Unit createInfantry(UnitType unitType) {
        if (unitType == UnitType.SOLDIER) {
            return new Soldier(50, 10, 25);
        }
        throw new EnumConstantNotPresentException(UnitType.class, unitType.name());
    }

    @Override
    public Unit creatGroundUnit(UnitType unitType) {
        if (unitType == UnitType.TANK) {
            return new Tank(500, 0, 75);
        }
        throw new EnumConstantNotPresentException(UnitType.class, unitType.name());
    }

    @Override
    public Unit createAirUnit(UnitType unitType) {
        if (unitType == UnitType.HELICOPTER) {
            return new Helicopter(1200, 50, 400);
        }
        throw new EnumConstantNotPresentException(UnitType.class, unitType.name());
    }
}
