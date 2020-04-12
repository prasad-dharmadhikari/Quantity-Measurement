package com.bridgelabz.quantitymeasurement.utility;

public enum MeasurementUnit {
    FEET(12.0, MeasurementType.LENGTH),
    INCH(1.0, MeasurementType.LENGTH),
    YARD(36.0, MeasurementType.LENGTH),
    CENTIMETER(0.4, MeasurementType.LENGTH),

    GALLON(3.78, MeasurementType.VOLUME),
    LITRES(1, MeasurementType.VOLUME),
    MILLILITERS(0.001, MeasurementType.VOLUME),

    KILOGRAMS(1.0, MeasurementType.WEIGHT),
    GRAMS(0.001, MeasurementType.WEIGHT),
    TONNE(1000, MeasurementType.WEIGHT),

    FAHRENHEIT(1, MeasurementType.TEMPERATURE),
    CELSIUS(2.12, MeasurementType.TEMPERATURE);

    Double baseValue;
    MeasurementType type;

    MeasurementUnit(double baseValue, MeasurementType type) {
        this.baseValue = baseValue;
        this.type = type;
    }

    public Double convertToBaseValue(Double quantity) {
        return quantity * this.baseValue;
    }
}
