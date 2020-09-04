import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import quantitymeasurement.QuantityMeasurement;
import quantitymeasurement.QuantityMeasurementException;
import quantitymeasurement.UnitType;

public class QuantityMeasurementTest {

    private QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void given0Feetand0Feet_shouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0FeetAnd1Feet_IfNotEqual_shouldReturnFalse() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertFalse(compare);
    }


    @Test
    public void givenNullValueForFeet_IfEqual_ShouldThrowException() {
        try {
            quantityMeasurement.calculateUnit(UnitType.FEET, null);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenQuantityMeasurementReference_IfProper_ShouldReturnTrue() {
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenType_IfEqual_ShouldReturnEqual() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenValueCheckForInch_IfEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 4.2);
        double result2 = quantityMeasurement.calculateUnit(UnitType.INCH, 4.2);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenQuantityMeasurementType_IfNotProper_ShouldReturnFalse() {
        boolean equals = quantityMeasurement.equals(new QuantityMeasurementException("NULL",
                QuantityMeasurementException.ExceptionType.NULL_VALUE));
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_shouldReturnFalse() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.INCH, 1.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertFalse(compare);

    }

    @Test
    public void givenValueCheckForFeet_IfEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 4.2);
        double result2 = quantityMeasurement.calculateUnit(UnitType.FEET, 4.2);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);

    }

    @Test
    public void given1FeetAnd12InchesForFeet_IfEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.INCH, 12.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1YardAnd3FeetForYard_IfEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 3.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1YardAnd2FeetForYard_IfNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 2.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1YardAnd36InchForYard_IfEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.INCH, 36.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given36InchAnd1yard_IfEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 36.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given3FeetAnd1yard_IfEqual_ShouldReturnEqual() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 3.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given30InchAnd1yard_IfNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 30.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given2InchAnd5Centimeter_IfEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 5.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1InchAnd5Centimeter_IfNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.INCH, 1.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 5.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given8InchAnd20Centimeter_IfEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 20.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.INCH, 8.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given5InchAnd11Centimeter_IfNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 11.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.INCH, 5.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given2FeetAnd60Centimeter_IfEqual_ShouldReturnEqual() {
        double result1 = quantityMeasurement.calculateUnit(UnitType.FEET, 2.0);
        double result2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 60.0);
        boolean compare = quantityMeasurement.compare(result1,result2);
        Assert.assertTrue(compare);
    }
}

