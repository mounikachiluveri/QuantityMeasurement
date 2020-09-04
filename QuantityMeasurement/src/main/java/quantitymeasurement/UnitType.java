package quantitymeasurement;

public enum UnitType {
    INCH(1.0), FEET(12.0), YARD(36.0), CENTIMETRE(1/2.5);

    public double unitConversion;

    UnitType(double unitConversion) {
        this.unitConversion = unitConversion;
    }
}
