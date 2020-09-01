package quantitymeasurement;

public class QuantityMeasurement {
    public double value;

    public double returnUnit(UnitType type, Double unit) {
        return unit * type.conversation;
    }
}