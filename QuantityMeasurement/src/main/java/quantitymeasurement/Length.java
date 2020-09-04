package quantitymeasurement;

public class Length {

    private static final double FEET_TO_INCH = 12.0;

    public enum Unit {FEET, INCH}

    private final Unit unit;
    private final double value;

    public Length(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length thatLength) {
        if (this.unit.equals(unit.FEET) && thatLength.unit.equals(unit.FEET))
            return Double.compare(this.value, thatLength.value) == 0;
        if (this.unit.equals(unit.FEET) && thatLength.unit.equals(unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, thatLength.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length feet = (Length) o;
        return Double.compare(feet.value, value) == 0;
    }
}
