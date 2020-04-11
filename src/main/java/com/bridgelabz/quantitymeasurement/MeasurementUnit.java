package com.bridgelabz.quantitymeasurement;

public enum MeasurementUnit {
    FEET(12), INCH(1), YARD(36);
    Double baseValue;

    MeasurementUnit(double baseValue) {
        this.baseValue = baseValue;
    }
    public Double convertToBaseValue(Double distance) {
        return distance * baseValue;
    }
}
