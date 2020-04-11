package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12), INCH(1), YARD(36);
    Double baseValue;

    Unit(double baseValue) {
        this.baseValue = baseValue;
    }
    public Double convertToBaseValue(Double distance) {
        return distance * baseValue;
    }
}
