package quantitymeasurement;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType{
        NULL_VALUE
    }
    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
