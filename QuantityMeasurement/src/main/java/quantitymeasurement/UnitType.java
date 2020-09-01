package quantitymeasurement;

public enum UnitType {
    FEET(12.0), INCH(1.0);
    double conversation;

    UnitType(double conversation) {
        this.conversation = conversation;
    }
}
