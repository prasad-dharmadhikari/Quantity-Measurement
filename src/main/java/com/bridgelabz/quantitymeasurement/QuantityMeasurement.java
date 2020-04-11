package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    public String compare(Distance firstValue, Distance secondValue) {
        if (firstValue.equals(secondValue))
            return "equal";
        return "not equal";
    }
}
