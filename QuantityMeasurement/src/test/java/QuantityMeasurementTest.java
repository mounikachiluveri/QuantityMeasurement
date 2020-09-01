import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.QuantityMeasurement;

public class QuantityMeasurementTest {

    @Test
    public void given0Feetand0Feet_shouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inch = quantityMeasurement.returnUnit(12.0, 0.0);
        Assert.assertEquals(inch, 0.0, 0.0);
    }

    @Test
    public void given0Feetand1Feet_IfNotEqual_shouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inch1 = quantityMeasurement.returnUnit(12.0, 0.0);
        double inch2 = quantityMeasurement.returnUnit(12.0, 1.0);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }
}



