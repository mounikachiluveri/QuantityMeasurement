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
    public void given0FeetAnd0Feet_shouldReturnTrue() throws QuantityMeasurementException {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0FeetAnd1Feet_IfNotEqual_shouldReturnFalse() throws QuantityMeasurementException {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 0.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertFalse(compare);
    }


    @Test
    public void givenNullValueForFeet_IfEqual_ShouldThrowException() {
        try {
            quantityMeasurement.calculateUnit(UnitType.FEET, null);
        } catch (NullPointerException | QuantityMeasurementException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenQuantityMeasurementReference_IfProper_ShouldReturnTrue() {
        boolean referenceCheck = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(referenceCheck);
    }

    @Test
    public void givenType_IfEqual_ShouldReturnEqual() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenValueCheckForInch_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
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
    public void given0InchAnd0Inch_shouldReturnTrue() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_shouldReturnFalse() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 0.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 1.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenValueCheckForFeet_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 4.2);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.FEET, 4.2);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd12InchesForFeet_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 12.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1YardAnd3FeetForYard_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 3.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1YardAnd2FeetForYard_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 2.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(feet1, feet2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1YardAnd36InchForYard_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        double yard2 = quantityMeasurement.calculateUnit(UnitType.INCH, 36.0);
        boolean compare = quantityMeasurement.compare(yard1, yard2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given36InchAnd1yard_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.INCH, 36.0);
        double yard2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(yard1, yard2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given3FeetAnd1yard_IfEqual_ShouldReturnEqual() throws QuantityMeasurementException {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.FEET, 3.0);
        double yard2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(yard1, yard2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given30InchAnd1yard_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.INCH, 30.0);
        double yard2 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        boolean compare = quantityMeasurement.compare(yard1, yard2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given2InchAnd5Centimeter_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 5.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1InchAnd5Centimeter_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 1.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 5.0);
        boolean compare = quantityMeasurement.compare(inch1, inch2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given8InchAnd20Centimeter_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double centimetre1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 20.0);
        double centimetre2 = quantityMeasurement.calculateUnit(UnitType.INCH, 8.0);
        boolean compare = quantityMeasurement.compare(centimetre1, centimetre2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given5InchAnd11Centimeter_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double centimetre1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 11.0);
        double centimetre2 = quantityMeasurement.calculateUnit(UnitType.INCH, 5.0);
        boolean compare = quantityMeasurement.compare(centimetre1, centimetre2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1YardAnd90Centimeter_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double yard1 = quantityMeasurement.calculateUnit(UnitType.YARD, 1.0);
        double centimetre1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 90.0);
        boolean compare = quantityMeasurement.compare(yard1, centimetre1);
        Assert.assertTrue(compare);
    }

    @Test
    public void given4InchesAnd9Centimeter_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 4.0);
        double centimetre1 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 9.0);
        boolean compare = quantityMeasurement.compare(inch1, centimetre1);
        Assert.assertFalse(compare);
    }

    @Test
    public void given2InchesAnd2Inches_WhenEqualTo4Inches_ShouldReturnTrue() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch3 = quantityMeasurement.addition(inch1, inch2);
        boolean compare = quantityMeasurement.compare(4.0, inch3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given2InchAnd1Feet_WhenAddedEqualTo14Inches_ShouldReturnTrue() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double inch3 = quantityMeasurement.addition(inch1, inch2);
        boolean compare = quantityMeasurement.compare(14.0, inch3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAddedEqualTo24Inches_ShouldReturnTrue() throws QuantityMeasurementException {
        double feet1 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double feet2 = quantityMeasurement.calculateUnit(UnitType.FEET, 1.0);
        double inch3 = quantityMeasurement.addition(feet1, feet2);
        boolean compare = quantityMeasurement.compare(24.0, inch3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given2InchesAnd2point5Centimetre_WhenAddedEqualTo3Inches_ShouldReturnTrue() throws QuantityMeasurementException {
        double inch1 = quantityMeasurement.calculateUnit(UnitType.INCH, 2.0);
        double inch2 = quantityMeasurement.calculateUnit(UnitType.CENTIMETRE, 2.5);
        double inch3 = quantityMeasurement.addition(inch1, inch2);
        boolean compare = quantityMeasurement.compare(3.0, inch3);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenGallonAndLitresVolume_WhenProper_ShouldReturnTrue() throws QuantityMeasurementException {
        double gallon = quantityMeasurement.calculateUnit(UnitType.GALLON, 1.0);
        double litre = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.785);
        boolean compare = quantityMeasurement.compare(gallon, litre);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1GallonAnd3point785LitresVolume_WhenAddedEqualTo7point57_ShouldReturnTrue() throws QuantityMeasurementException {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.GALLON, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.785);
        double litre3 = quantityMeasurement.addition(litre1, litre2);
        boolean compare = quantityMeasurement.compare(7.57, litre3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1LitreAnd1000MlVolume_WhenAddedEqualTo2Litre_ShouldReturnTrue() throws QuantityMeasurementException {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.LITRE, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE, 1000.0);
        double litre3 = quantityMeasurement.addition(litre1, litre2);
        boolean compare = quantityMeasurement.compare(2, litre3);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1GallonAnd3LitresVolume_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.GALLON, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.0);
        boolean compare = quantityMeasurement.compare(litre1, litre2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1LitreAnd900MilliLitresVolume_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.LITRE, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE, 900.0);
        boolean compare = quantityMeasurement.compare(litre1, litre2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1GallonAnd3point785LitresVolume_WhenAddedNotEqualTo8Litres_ShouldReturnFalse() throws QuantityMeasurementException {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.GALLON, 1.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.LITRE, 3.785);
        double litre3 = quantityMeasurement.addition(litre1, litre2);
        boolean compare = quantityMeasurement.compare(8.0, litre3);
        Assert.assertFalse(compare);
    }

    @Test
    public void given0GallonAnd0GallonVolume_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double gallon1 = quantityMeasurement.calculateUnit(UnitType.GALLON, 0.0);
        double gallon2 = quantityMeasurement.calculateUnit(UnitType.GALLON, 0.0);
        boolean compare = quantityMeasurement.compare(gallon1, gallon2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0LitreAnd0LitreVolume_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.LITRE, 0.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.LITRE, 0.0);
        boolean compare = quantityMeasurement.compare(litre1, litre2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0MilliLitreAnd0MilliLitreVolume_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double litre1 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE, 0.0);
        double litre2 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE, 0.0);
        boolean compare = quantityMeasurement.compare(litre1, litre2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1MilliLitreAnd0MilliLitreVolume_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double milliLitre1 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE, 1.0);
        double milliLitre2 = quantityMeasurement.calculateUnit(UnitType.MILLILITRE, 0.0);
        boolean compare = quantityMeasurement.compare(milliLitre1, milliLitre2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given0KilogramAnd0Kilogram_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double kilogram1 = quantityMeasurement.calculateUnit(UnitType.KILOGRAM, 0.0);
        double kilogram2 = quantityMeasurement.calculateUnit(UnitType.KILOGRAM, 0.0);
        boolean compare = quantityMeasurement.compare(kilogram1, kilogram2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0GramAnd0Gram_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double gram1 = quantityMeasurement.calculateUnit(UnitType.GRAM, 0.0);
        double gram2 = quantityMeasurement.calculateUnit(UnitType.GRAM, 0.0);
        boolean compare = quantityMeasurement.compare(gram1, gram2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1KilogramAnd1000Grams_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double kilogram1 = quantityMeasurement.calculateUnit(UnitType.KILOGRAM, 1.0);
        double kilogram2 = quantityMeasurement.calculateUnit(UnitType.GRAM, 1000.0);
        boolean compare = quantityMeasurement.compare(kilogram1, kilogram2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1KilogramAnd900Grams_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double kilogram1 = quantityMeasurement.calculateUnit(UnitType.KILOGRAM, 1.0);
        double kilogram2 = quantityMeasurement.calculateUnit(UnitType.GRAM, 900.0);
        boolean compare = quantityMeasurement.compare(kilogram1, kilogram2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given0TonneAnd0Tonne_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double tonne1 = quantityMeasurement.calculateUnit(UnitType.TONNE, 0.0);
        double tonne2 = quantityMeasurement.calculateUnit(UnitType.TONNE, 0.0);
        boolean compare = quantityMeasurement.compare(tonne1, tonne2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1TonneAnd1000Kilograms_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double tonne1 = quantityMeasurement.calculateUnit(UnitType.TONNE, 1.0);
        double tonne2 = quantityMeasurement.calculateUnit(UnitType.KILOGRAM, 1000.0);
        boolean compare = quantityMeasurement.compare(tonne1, tonne2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1TonneAnd999Kilograms_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        double tonne1 = quantityMeasurement.calculateUnit(UnitType.TONNE, 1.0);
        double tonne2 = quantityMeasurement.calculateUnit(UnitType.KILOGRAM, 999.0);
        boolean compare = quantityMeasurement.compare(tonne1, tonne2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1TonneAnd1000Grams_WhenAddedEqualTo1001Kilograms_ShouldTrue() throws QuantityMeasurementException {
        double tonne1 = quantityMeasurement.calculateUnit(UnitType.TONNE, 1.0);
        double gram1 = quantityMeasurement.calculateUnit(UnitType.GRAM, 1000.0);
        double kilogram1 = quantityMeasurement.addition(tonne1, gram1);
        boolean compare = quantityMeasurement.compare(1001.0, kilogram1);
        Assert.assertTrue(compare);
    }

    //Temperature and Fahrenheit
    @Test
    public void given0FahrenheitAnd0Fahrenheit_WhenEqual_ShouldReturnTrue() {
        double fahrenheit1 = quantityMeasurement.CalculateTemperature(UnitType.FAHRENHEIT, 0.0);
        double fahrenheit2 = quantityMeasurement.CalculateTemperature(UnitType.FAHRENHEIT, 0.0);
        boolean compare = quantityMeasurement.compare(fahrenheit1, fahrenheit2 );
        Assert.assertTrue(compare);
    }

    @Test
    public void given0CelsiusAnd0Celsius_IfEqual_ShouldReturnTrue() {
        double celsius1 = quantityMeasurement.CalculateTemperature(UnitType.CELSIUS, 0.0);
        double celsius2 = quantityMeasurement.CalculateTemperature(UnitType.CELSIUS, 0.0);
        boolean compare = quantityMeasurement.compare(celsius1, celsius2 );
        Assert.assertTrue(compare);
    }
}


































































































