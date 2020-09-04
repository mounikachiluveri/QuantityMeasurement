package quantitymeasurement;

public enum UnitType {
    INCH(1.0), FEET(12.0), YARD(36.0),
    CENTIMETRE(1 / 2.5), GALLON(1 * 3.785),
    LITRE(1.0), MILLILITRE(1.0 / 1000);;

    public double unitConversion;

    UnitType(double unitConversion) {
        this.unitConversion = unitConversion;
    }
}
