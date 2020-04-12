package com.bridgelabz.quantitymeasurement;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.service.QuantityMeasurementService;
import com.bridgelabz.quantitymeasurement.utility.MeasurementQuantity;
import com.bridgelabz.quantitymeasurement.utility.MeasurementType;
import com.bridgelabz.quantitymeasurement.utility.MeasurementUnit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementServiceTest {
    QuantityMeasurementService quantityMeasurement = new QuantityMeasurementService();

    @Test
    public void givenTwoFeetValues_IfCompared_ShouldReturnAppropriateResult() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(0.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        MeasurementQuantity thirdValue = new MeasurementQuantity(5.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        String result2 = quantityMeasurement.compare(firstValue, thirdValue);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }

    @Test
    public void givenTwoFeetObjects_IfOneOfThemIsNull_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(0.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
            String result = quantityMeasurement.compare(firstValue, null);
            Assert.assertEquals("not equal", result);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, e.type);
        }
    }

    @Test
    public void givenTwoFeetObjects_IfObjectsAreSame_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, firstValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoObjects_IfBothOfThemAreNull_ShouldThrowException() {
        try {
            quantityMeasurement.compare(null, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, e.type);
        }
    }

    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(0.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoObjects_IfValuesAreSame_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(12.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(12.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoInchValues_IfCompared_ShouldReturnAppropriateResult() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(0.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity thirdValue = new MeasurementQuantity(5.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        String result2 = quantityMeasurement.compare(firstValue, thirdValue);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }

    @Test
    public void givenTwoInchObjects_IfOneOfThemIsNull_ShouldReturnNotEqual() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(0.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
            String result = quantityMeasurement.compare(firstValue, null);
            Assert.assertEquals("not equal", result);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, e.type);
        }
    }

    @Test
    public void givenTwoInchObjects_IfObjectsAreSame_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, firstValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoInchObjects_IfTypeIsSame_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(0.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoInchObjects_IfValuesAreSame_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(12.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(12.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(3.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, MeasurementUnit.YARD, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given1FeetAndOneYard_ShouldReturnNotEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, MeasurementUnit.YARD, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("not equal", result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldNotReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, MeasurementUnit.YARD, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("not equal", result);
    }

    @Test
    public void given1YardAnd36Inch_ShouldNotReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.YARD, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(36.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(36.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, MeasurementUnit.YARD, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.YARD, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(3.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(2.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(5.0, MeasurementUnit.CENTIMETER, MeasurementType.LENGTH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoInchValues_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(2.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(2.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(4.0, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneInchValue_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(2.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(14.0, result, 0.0);
    }

    @Test
    public void givenTwoFeetValues_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, MeasurementUnit.FEET, MeasurementType.LENGTH);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(24.0, result, 0.0);
    }

    @Test
    public void givenOneInchAndOneCentimeterValue_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(2.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
        MeasurementQuantity secondValue = new MeasurementQuantity(2.5, MeasurementUnit.CENTIMETER, MeasurementType.LENGTH);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(3.0, result, 0.0);
    }

    @Test
    public void givenOneInchAndOneCentimeterValue_IfOneOfThemIsNull_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(2.0, MeasurementUnit.INCH, MeasurementType.LENGTH);
            Double result = quantityMeasurement.addTwoValues(firstValue, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, e.type);
        }
    }

    @Test
    public void givenOneInchAndOneCentimeterValue_IfBothOfThemAreNull_ShouldThrowException() {
        try {
            Double result = quantityMeasurement.addTwoValues(null, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, e.type);
        }
    }

    @Test
    public void givenOneGallonAndOneLitreValue_IfEqual_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.GALLON, MeasurementType.VOLUME);
        MeasurementQuantity secondValue = new MeasurementQuantity(3.78, MeasurementUnit.LITRES, MeasurementType.VOLUME);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenOneLitreAndOneMillilitreValue_IfEqual_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.LITRES, MeasurementType.VOLUME);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, MeasurementUnit.MILLILITERS, MeasurementType.VOLUME);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenOneGallonAndOneLitreValue_WhenAdded_ShouldReturnResultInLitres() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.GALLON, MeasurementType.VOLUME);
        MeasurementQuantity secondValue = new MeasurementQuantity(3.78, MeasurementUnit.LITRES, MeasurementType.VOLUME);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(7.56, result, 0.0);
    }

    @Test
    public void givenOneLitreAndOneMillilitreValue_WhenAdded_ShouldReturnResultInLitres() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.LITRES, MeasurementType.VOLUME);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, MeasurementUnit.MILLILITERS, MeasurementType.VOLUME);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(2.0, result, 0.0);
    }

    @Test
    public void givenOneKilogramValueAndOneGramValue_IfEqual_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.KILOGRAMS, MeasurementType.WEIGHT);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, MeasurementUnit.GRAMS, MeasurementType.WEIGHT);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenOneTonneValueAndOneKilogramValue_IfEqual_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.TONNE, MeasurementType.WEIGHT);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, MeasurementUnit.KILOGRAMS, MeasurementType.WEIGHT);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenOneTonneAndOneGramValue_WhenAdded_ShouldReturnResultInKilogram() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.TONNE, MeasurementType.WEIGHT);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, MeasurementUnit.GRAMS, MeasurementType.WEIGHT);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(1001.0, result, 0.0);
    }

    @Test
    public void givenTemperatureInCelsiusAndFahrenheit_IfEqual_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(212.0, MeasurementUnit.FAHRENHEIT, MeasurementType.TEMPERATURE);
        MeasurementQuantity secondValue = new MeasurementQuantity(100.0, MeasurementUnit.CELSIUS, MeasurementType.TEMPERATURE);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoObjects_IfMeasurementTypesAreNotEqual_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(212.0, MeasurementUnit.FAHRENHEIT, MeasurementType.TEMPERATURE);
            MeasurementQuantity secondValue = new MeasurementQuantity(100.0, MeasurementUnit.CELSIUS, MeasurementType.VOLUME);
            quantityMeasurement.compare(firstValue, secondValue);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void givenTwoObjects_IfOneOfThemIsNull_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(212.0, MeasurementUnit.FAHRENHEIT, MeasurementType.TEMPERATURE);
            quantityMeasurement.compare(null, firstValue);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, e.type);
        }
    }

    @Test
    public void givenTwoValues_IfMeasurementTypesAreNotEqualWhileAddition_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(1.0, MeasurementUnit.TONNE, MeasurementType.VOLUME);
            MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, MeasurementUnit.GRAMS, MeasurementType.WEIGHT);
            Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
            Assert.assertEquals(1001.0, result, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.TYPE_MISMATCH, e.type);
        }
    }
}
