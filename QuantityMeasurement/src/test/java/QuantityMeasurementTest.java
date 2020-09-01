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
}


