package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    public String compare(Feet f1, Feet f2) {
        if (f1.equals(f2))
            return "equal";
        return "not equal";
    }
}
