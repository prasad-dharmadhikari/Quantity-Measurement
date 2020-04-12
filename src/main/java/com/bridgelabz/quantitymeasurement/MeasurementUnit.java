package com.bridgelabz.quantitymeasurement;

public enum MeasurementUnit {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);

    Double baseValue;

    MeasurementUnit(double baseValue) {
        this.baseValue = baseValue;
    }

    public Double convertToBaseValue(Double distance) {
        return distance * baseValue;
    }
}
