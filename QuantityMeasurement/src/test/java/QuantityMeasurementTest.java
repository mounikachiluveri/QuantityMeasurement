import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Length;

public class QuantityMeasurementTest {

    @Test
    public void given0LengthAnd0Length_shouldReturnEqual() {
        Length Length1 = new Length(Length.Unit.FEET, 0.0);
        Length Length2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(Length1, Length2);
    }

    @Test
    public void given1LengthAnd2Length_IfNotEqual_shouldReturnNotEqual() {
        Length Length1 = new Length(Length.Unit.FEET, 1.0);
        Length Length2 = new Length(Length.Unit.FEET, 2.0);
        Assert.assertNotEquals(Length1, Length2);
    }

    @Test
    public void givenNullValueToLength_shouldThrowException() {
        try {
            Length Length1 = new Length(Length.Unit.FEET, null);
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenValueCheckForLength_IfEqual_shouldReturnEqual() {
        Length Length1 = new Length(Length.Unit.FEET, 2.0);
        Length Length2 = new Length(Length.Unit.FEET, 2.0);
        Assert.assertEquals(Length1, Length2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1InchAnd2Inch_IfNotEqual_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullValueToInch_shouldThrowException() {
        try {
            Length inch1 = new Length(Length.Unit.INCH, null);
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenValueCheckForInch_IfEqual_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 3.0);
        Length inch2 = new Length(Length.Unit.INCH, 3.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAnd1Inch_shouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }
}
