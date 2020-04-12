package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenTwoFeetValues_IfCompared_ShouldReturnAppropriateResult() {
        Distance firstValue = new Distance(0.0, MeasurementUnit.FEET);
        Distance secondValue = new Distance(0.0, MeasurementUnit.FEET);
        Distance thirdValue = new Distance(5.0, MeasurementUnit.FEET);
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        String result2 = quantityMeasurement.compare(firstValue, thirdValue);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }

    @Test
    public void givenTwoFeetObjects_IfOneOfThemIsNull_ShouldReturnNotEqual() {
        Distance firstValue = new Distance(0.0, MeasurementUnit.FEET);
        String result = quantityMeasurement.compare(firstValue, null);
        Assert.assertEquals("not equal", result);
    }

    @Test
    public void givenTwoFeetObjects_IfObjectsAreSame_ShouldReturnEqual() {
        Distance firstValue = new Distance(0.0, MeasurementUnit.FEET);
        String result = quantityMeasurement.compare(firstValue, firstValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnEqual() {
        Distance firstValue = new Distance(0.0, MeasurementUnit.FEET);
        Distance secondValue = new Distance(0.0, MeasurementUnit.FEET);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoObjects_IfValuesAreSame_ShouldReturnEqual() {
        Distance firstValue = new Distance(12.0, MeasurementUnit.FEET);
        Distance secondValue = new Distance(12.0, MeasurementUnit.FEET);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoInchValues_IfCompared_ShouldReturnAppropriateResult() {
        Distance firstValue = new Distance(0.0, MeasurementUnit.INCH);
        Distance secondValue = new Distance(0.0, MeasurementUnit.INCH);
        Distance thirdValue = new Distance(5.0, MeasurementUnit.INCH);
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        String result2 = quantityMeasurement.compare(firstValue, thirdValue);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }

    @Test
    public void givenTwoInchObjects_IfOneOfThemIsNull_ShouldReturnNotEqual() {
        Distance firstValue = new Distance(0.0, MeasurementUnit.INCH);
        String result = quantityMeasurement.compare(firstValue, null);
        Assert.assertEquals("not equal", result);
    }

    @Test
    public void givenTwoInchObjects_IfObjectsAreSame_ShouldReturnEqual() {
        Distance firstValue = new Distance(0.0, MeasurementUnit.INCH);
        String result = quantityMeasurement.compare(firstValue, firstValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoInchObjects_IfTypeIsSame_ShouldReturnEqual() {
        Distance firstValue = new Distance(0.0, MeasurementUnit.INCH);
        Distance secondValue = new Distance(0.0, MeasurementUnit.INCH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void givenTwoInchObjects_IfValuesAreSame_ShouldReturnEqual() {
        Distance firstValue = new Distance(12.0, MeasurementUnit.INCH);
        Distance secondValue = new Distance(12.0, MeasurementUnit.INCH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        Distance firstValue = new Distance(3.0, MeasurementUnit.FEET);
        Distance secondValue = new Distance(1.0, MeasurementUnit.YARD);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given1FeetAndOneYard_ShouldReturnNotEqual() {
        Distance firstValue = new Distance(1.0, MeasurementUnit.FEET);
        Distance secondValue = new Distance(1.0, MeasurementUnit.YARD);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("not equal", result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldNotReturnEqual() {
        Distance firstValue = new Distance(1.0, MeasurementUnit.INCH);
        Distance secondValue = new Distance(1.0, MeasurementUnit.YARD);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("not equal", result);
    }

    @Test
    public void given1YardAnd36Inch_ShouldNotReturnEqual() {
        Distance firstValue = new Distance(1.0, MeasurementUnit.YARD);
        Distance secondValue = new Distance(36.0, MeasurementUnit.INCH);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() {
        Distance firstValue = new Distance(36.0, MeasurementUnit.INCH);
        Distance secondValue = new Distance(1.0, MeasurementUnit.YARD);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        Distance firstValue = new Distance(1.0, MeasurementUnit.YARD);
        Distance secondValue = new Distance(3.0, MeasurementUnit.FEET);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqual() {
        Distance firstValue = new Distance(2.0, MeasurementUnit.INCH);
        Distance secondValue = new Distance(5.0, MeasurementUnit.CENTIMETER);
        String result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result);
    }
}
