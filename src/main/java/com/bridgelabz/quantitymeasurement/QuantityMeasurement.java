package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    public String compare(MeasurementQuantity firstValue, MeasurementQuantity secondValue) {
        if (firstValue.equals(secondValue))
            return "equal";
        return "not equal";
    }

    public Double addTwoValues(MeasurementQuantity firstValue, MeasurementQuantity secondValue) {
        return firstValue.quantity + secondValue.quantity;
    }
}
