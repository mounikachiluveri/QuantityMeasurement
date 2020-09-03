import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Feet;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd2Feet_IfNotEqual_shouldReturnNotEqual() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(2.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullValue_shouldThrowException() {
        try {
            Feet feet1 = new Feet(null);
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenValueCheck_IfEqual_shouldReturnEqual() {
        Feet feet1 = new Feet(2.0);
        Feet feet2 = new Feet(2.0);
        Assert.assertEquals(feet1, feet2);
    }
}
