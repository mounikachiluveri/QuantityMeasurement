import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.QuantityMeasurement;
import quantitymeasurement.QuantityMeasurementException;
import quantitymeasurement.UnitType;

public class QuantityMeasurementTest {

    @Test
    public void given0FEETand0FEET_shouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double Feet1 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        double Feet2 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        Assert.assertEquals(Feet1, Feet2, 0.0);
    }

    @Test
    public void given0FEETand1FEET_IfNotEqual_shouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double Feet1 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        double Feet2 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        Assert.assertNotEquals(Feet1, Feet2, 0.0);
    }

    @Test
    public void givenNullValueForFEET_IfEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        try {
            quantityMeasurement.returnUnit(UnitType.FEET, null);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenQuantityMeasurementReference_IfProper_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenQuantityMeasurementReference_IfNotProper_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenType_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenValueCheckForInch_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 4.2);
        double inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 4.2);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenQuantityMeasurementType_IfNotProper_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean equals = quantityMeasurement.equals(new QuantityMeasurementException("NULL",
                QuantityMeasurementException.ExceptionType.NULL_VALUE));
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        double inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_shouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double Feet1 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        double Feet2 = quantityMeasurement.returnUnit(UnitType.INCH, 1.0);
        Assert.assertNotEquals(Feet1, Feet2, 0.0);
    }

    @Test
    public void givenValueCheckForFeet_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double feet1 = quantityMeasurement.returnUnit(UnitType.FEET, 4.2);
        double feet2 = quantityMeasurement.returnUnit(UnitType.FEET, 4.2);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given1FeetAnd12InchesForFeet_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double feet1 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        double feet2 = quantityMeasurement.returnUnit(UnitType.INCH, 12.0);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

}



