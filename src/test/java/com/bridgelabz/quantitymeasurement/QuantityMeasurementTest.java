package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
    @Test
    public void givenTwoFeetValues_IfCompared_ShouldReturnAppropriateResult() {
        Feet f1 = new Feet(0.0);
        Feet f2 = new Feet(0.0);
        Feet f3 = new Feet(5.0);
        String result1 = quantityMeasurement.compare(f1, f2);
        String result2 = quantityMeasurement.compare(f1, f3);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }

    @Test
    public void givenTwoFeetObjects_IfOneOfThemIsNull_ShouldReturnNotEqual() {
        Feet f1 = new Feet(0.0);
        Feet f2 = null;
        String result1 = quantityMeasurement.compare(f1, f2);
        Assert.assertEquals("not equal", result1);
    }

    @Test
    public void givenTwoFeetObjects_IfObjectsAreSame_ShouldReturnEqual() {
        Feet f1 = new Feet(0.0);
        String result1 = quantityMeasurement.compare(f1, f1);
        Assert.assertEquals("equal", result1);
    }

    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnEqual() {
        Feet f1 = new Feet(0.0);
        Feet f2 = new Feet(0.0);
        String result1 = quantityMeasurement.compare(f1, f2);
        Assert.assertEquals("equal", result1);
    }

    @Test
    public void givenTwoObjects_IfValuesAreSame_ShouldReturnEqual() {
        Feet f1 = new Feet(12.0);
        Feet f2 = new Feet(12.0);
        String result1 = quantityMeasurement.compare(f1, f2);
        Assert.assertEquals("equal", result1);
    }
}
