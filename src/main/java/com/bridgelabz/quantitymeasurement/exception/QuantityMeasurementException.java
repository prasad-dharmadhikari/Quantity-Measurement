package com.bridgelabz.quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType {
        NULL_VALUE_ENTERED, TYPE_MISMATCH;
    }

   public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
