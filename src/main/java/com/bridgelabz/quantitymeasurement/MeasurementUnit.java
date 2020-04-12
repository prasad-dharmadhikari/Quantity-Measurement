package com.bridgelabz.quantitymeasurement;

public enum MeasurementUnit {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4),
    GALLON(3.78), LITRES(1), MILLILITERS(0.001),
    KILOGRAMS(1.0), GRAMS(0.001), TONNE(1000),
    FAHRENHEIT(1), CELSIUS(2.12);
    Double baseValue;

    MeasurementUnit(double baseValue) {
        this.baseValue = baseValue;
    }

    public Double convertToBaseValue(Double quantity) {
        return quantity * this.baseValue;
    }
}
