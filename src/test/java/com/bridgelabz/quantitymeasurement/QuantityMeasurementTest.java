package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
    @Test
    public void givenTwoFeetValues_IfCompared_ShouldReturnAppropriateResult() {
        Feet firstValue = new Feet(0.0);
        Feet secondValue = new Feet(0.0);
        Feet thirdValue = new Feet(5.0);
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        String result2 = quantityMeasurement.compare(firstValue, thirdValue);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }

    @Test
    public void givenTwoFeetObjects_IfOneOfThemIsNull_ShouldReturnNotEqual() {
        Feet firstValue = new Feet(0.0);
        Feet secondValue = null;
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("not equal", result1);
    }

    @Test
    public void givenTwoFeetObjects_IfObjectsAreSame_ShouldReturnEqual() {
        Feet firstValue = new Feet(0.0);
        String result1 = quantityMeasurement.compare(firstValue, firstValue);
        Assert.assertEquals("equal", result1);
    }

    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnEqual() {
        Feet firstValue = new Feet(0.0);
        Feet secondValue = new Feet(0.0);
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result1);
    }

    @Test
    public void givenTwoObjects_IfValuesAreSame_ShouldReturnEqual() {
        Feet firstValue = new Feet(12.0);
        Feet secondValue = new Feet(12.0);
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("equal", result1);
    }

    @Test
    public void givenTwoInchValues_IfCompared_ShouldReturnAppropriateResult() {
        Inch firstValue = new Inch(0.0);
        Inch secondValue = new Inch(0.0);
        Inch thirdValue = new Inch(5.0);
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        String result2 = quantityMeasurement.compare(firstValue, thirdValue);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }

    @Test
    public void givenTwoInchObjects_IfOneOfThemIsNull_ShouldReturnNotEqual() {
        Inch firstValue = new Inch(0.0);
        Inch secondValue = null;
        String result1 = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals("not equal", result1);
    }
}
