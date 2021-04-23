package FabrykaAbstrakcyjna;

public class BlueFactory implements Factory {
    @Override
    public Unit createInfantry(UnitType unitType) {
        if (unitType == UnitType.SOLDIER) {
            return new Soldier(70, 0, 35);
        }
        throw new EnumConstantNotPresentException(UnitType.class, unitType.name());
    }

    @Override
    public Unit creatGroundUnit(UnitType unitType) {
        if (unitType == UnitType.TANK) {
            return new Tank(700, 0, 55);
        }
        throw new EnumConstantNotPresentException(UnitType.class, unitType.name());
    }

    @Override
    public Unit createAirUnit(UnitType unitType) {
        if (unitType == UnitType.HELICOPTER) {
            return new Helicopter(100, 0, 350);
        }
        throw new EnumConstantNotPresentException(UnitType.class, unitType.name());
    }
}
