package quantitymeasurement;

public enum UnitType {
    Feet(12.0), Inch(1.0);
    double conversation;

    UnitType(double conversation) {
        this.conversation = conversation;
    }
}
