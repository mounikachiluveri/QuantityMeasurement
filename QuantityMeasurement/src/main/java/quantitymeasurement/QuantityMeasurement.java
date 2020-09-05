package quantitymeasurement;

import static quantitymeasurement.UnitType.CELSIUS;

public class QuantityMeasurement {
    private double value;

    public double calculateUnit(UnitType type, Double unit) throws QuantityMeasurementException {
        try {
            return unit * type.unitConversion;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null value", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    public boolean compare(double value1, double value2) {
        return value1 == value2;
    }

    public double addition(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public Double CalculateTemperature(UnitType type, Double unit) {
        Double fahrenheit = unit;
        if (type.equals(CELSIUS)) {
            fahrenheit = (unit * (9.0 / 5)) + 32;
        }
        return fahrenheit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }
}