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
    public void given0FeetAnd0Feet_shouldReturnTrue() {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0FeetAnd1Feet_IfNotEqual_shouldReturnFalse() {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
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
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 4.2);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 4.2);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenQuantityMeasurementType_IfNotProper_ShouldReturnFalse() {
        boolean equals = quantityMeasurement.equals(new QuantityMeasurementException("NULL",
                QuantityMeasurementException.ExceptionType.NULL_VALUE));
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnTrue() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_shouldReturnFalse() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 1.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertFalse(compare);

    }

    @Test
    public void givenValueCheckForFeet_IfEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 4.2);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.FEET, 4.2);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertTrue(compare);

    }

    @Test
    public void given1FeetAnd12InchesForFeet_IfEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 12.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1YardAnd3FeetForYard_IfEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 3.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1YardAnd2FeetForYard_IfNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 2.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1YardAnd36InchForYard_IfEqual_ShouldReturnTrue() {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        double yard2 = quantityMeasurement.calculateUnit(UnitType.INCH, 36.0);
        boolean compare = quantityMeasurement.compare(yard1, yard2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given36InchAnd1yard_IfEqual_ShouldReturnTrue() {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.INCH, 36.0);
        double yard2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(yard1, yard2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given3FeetAnd1yard_IfEqual_ShouldReturnEqual() {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.FEET, 3.0);
        double yard2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(yard1, yard2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given30InchAnd1yard_IfNotEqual_ShouldReturnFalse() {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.INCH, 30.0);
        double yard2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(yard1, yard2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given2InchAnd5Centimeter_IfEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 5.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1InchAnd5Centimeter_IfNotEqual_ShouldReturnFalse() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 1.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 5.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given8InchAnd20Centimeter_IfEqual_ShouldReturnTrue() {
        double centimetre1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 20.0);
        double centimetre2 = quantityMeasurement.calculateUnit(UnitType.INCH, 8.0);
        boolean compare = quantityMeasurement.compare(centimetre1, centimetre2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given5InchAnd11Centimeter_IfNotEqual_ShouldReturnFalse() {
        double centimetre1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 11.0);
        double centimetre2 = quantityMeasurement.calculateUnit(UnitType.INCH, 5.0);
        boolean compare = quantityMeasurement.compare(centimetre1, centimetre2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1YardAnd90Centimeter_IfEqual_ShouldReturnTrue() {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        double centimetre1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 90.0);
        boolean compare = quantityMeasurement.compare(yard1, centimetre1);
        Assert.assertTrue(compare);
    }

    @Test
    public void given4InchesAnd9Centimeter_IfNotEqual_ShouldReturnFalse() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 4.0);
        double centimetre1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 9.0);
        boolean compare = quantityMeasurement.compare(inch1, centimetre1);
        Assert.assertFalse(compare);
    }

    @Test
    public void given2InchesAnd2Inches_WhenEqualTo4Inches_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch3 = quantityMeasurement.addition(inch1, inch2);
        boolean compare = quantityMeasurement.compare(4.0, inch3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given2InchAnd1Feet_WhenAddedEqualTo14Inches_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double inch3 = quantityMeasurement.addition(inch1, inch2);
        boolean compare = quantityMeasurement.compare(14.0, inch3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAddedEqualTo24Inches_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double inch3 = quantityMeasurement.addition(feet1, feet2);
        boolean compare = quantityMeasurement.compare(24.0, inch3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given2InchesAnd2point5Centimetre_WhenAddedEqualTo3Inches_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 2.5);
        double inch3 = quantityMeasurement.addition(inch1, inch2);
        boolean compare = quantityMeasurement.compare(3.0, inch3);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenGallonAndLitresVolume_WhenProper_ShouldReturnTrue() {
        double gallon = quantityMeasurement.calculateUnit(UnitType.GALLON, 1.0);
        double litre = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.785);
        boolean compare = quantityMeasurement.compare(gallon, litre);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1GallonAnd3point785LitresVolume_WhenAddedEqualTo7point57_ShouldReturnTrue() {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.GALLON, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.785);
        double litre3 = quantityMeasurement.addition(litre1, litre2);
        boolean compare = quantityMeasurement.compare(7.57, litre3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1LitreAnd1000MlVolume_WhenAddedEqualTo2Litre_ShouldReturnTrue() {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.LITRE, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE, 1000.0);
        double litre3 = quantityMeasurement.addition(litre1, litre2);
        boolean compare = quantityMeasurement.compare(2, litre3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1GallonAnd3LitresVolume_IfNotEqual_ShouldReturnFalse() {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.GALLON, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.0);
        boolean compare = quantityMeasurement.compare(litre1, litre2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1LitreAnd900MilliLitresVolume_IfNotEqual_ShouldReturnFalse() {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.LITRE, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE, 900.0);
        boolean compare = quantityMeasurement.compare(litre1, litre2);
        Assert.assertFalse(compare);
    }
}

