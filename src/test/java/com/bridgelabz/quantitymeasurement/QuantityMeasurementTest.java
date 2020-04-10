package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenTwoFeetValues_IfCompared_ShouldReturnAppropriateResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Feet f1 = new Feet(0);
        Feet f2 = new Feet(0);
        Feet f3 = new Feet(5);
        String result1 = quantityMeasurement.compare(f1, f2);
        String result2 = quantityMeasurement.compare(f1, f3);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }
}
