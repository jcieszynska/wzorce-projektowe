package Fabryka;

public class UnitFactory implements Factory{
    @Override
    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case SOLDIER:
                return new Soldier(100, 0, 50);
            case TANK:
                return new Tank(600, 0, 300);
            default:
                throw new EnumConstantNotPresentException(UnitType.class, unitType.name());
        }
    }
}
