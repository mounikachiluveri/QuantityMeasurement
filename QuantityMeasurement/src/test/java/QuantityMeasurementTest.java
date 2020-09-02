import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
    public void given0FEETand0FEET_shouldReturnEqual() {
        double Feet1 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        double Feet2 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        Assert.assertEquals(Feet1, Feet2, 0.0);
    }

    @Test
    public void given0FEETand1FEET_IfNotEqual_shouldReturnNotEqual() {
        double Feet1 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        double Feet2 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        Assert.assertNotEquals(Feet1, Feet2, 0.0);
    }

    @Test
    public void givenNullValueForFEET_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnit(UnitType.FEET, null);
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
    public void givenQuantityMeasurementReference_IfFProper_ShouldReturnTrue() {
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
    public void givenValueCheckForInch_IfEqual_ShouldReturnEqual() {
        double inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 4.2);
        double inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 4.2);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenQuantityMeasurementType_IfNotProper_ShouldReturnFalse() {
        boolean equals = quantityMeasurement.equals(new QuantityMeasurementException("NULL",
                QuantityMeasurementException.ExceptionType.NULL_VALUE));
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnEqual() {
        double inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        double inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_shouldReturnNotEqual() {
        double Feet1 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        double Feet2 = quantityMeasurement.returnUnit(UnitType.INCH, 1.0);
        Assert.assertNotEquals(Feet1, Feet2, 0.0);
    }

    @Test
    public void givenValueCheckForFeet_IfEqual_ShouldReturnEqual() {
        double feet1 = quantityMeasurement.returnUnit(UnitType.FEET, 4.2);
        double feet2 = quantityMeasurement.returnUnit(UnitType.FEET, 4.2);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given1FeetAnd12InchesForFeet_IfEqual_ShouldReturnEqual() {
        double feet1 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        double feet2 = quantityMeasurement.returnUnit(UnitType.INCH, 12.0);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given1YardAnd3FeetForYard_IfEqual_ShouldReturnEqual() {
        double yard1 = quantityMeasurement.returnUnit(UnitType.FEET, 3.0);
        double yard2 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        Assert.assertEquals(yard1, yard2, 0.0);
    }

    @Test
    public void given1YardAnd2FeetForYard_IfNotEqual_ShouldReturnNotEqual() {
        double yard1 = quantityMeasurement.returnUnit(UnitType.FEET, 2.0);
        double yard2 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2, 0.0);
    }

    @Test
    public void given1YardAnd1FeetForYard_IfNotEqual_ShouldReturnNotEqual() {
        double yard1 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        double yard2 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2, 0.0);
    }
}



