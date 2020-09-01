import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.QuantityMeasurement;
import quantitymeasurement.UnitType;

public class QuantityMeasurementTest {

    @Test
    public void given0Feetand0Feet_shouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inch1 = quantityMeasurement.returnUnit(UnitType.Feet, 0.0);
        double inch2 = quantityMeasurement.returnUnit(UnitType.Feet, 0.0);
        Assert.assertEquals(inch1,inch2,0.0);
    }

    @Test
    public void given0Feetand1Feet_IfNotEqual_shouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inch1 = quantityMeasurement.returnUnit(UnitType.Feet, 0.0);
        double inch2 = quantityMeasurement.returnUnit(UnitType.Feet, 1.0);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenNullValueForFeet_IfEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        try {
            quantityMeasurement.returnUnit(UnitType.Feet, null);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }
}


