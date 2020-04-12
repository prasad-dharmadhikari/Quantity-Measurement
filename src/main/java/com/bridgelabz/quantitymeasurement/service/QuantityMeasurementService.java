package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.utility.MeasurementQuantity;

import java.util.Objects;

public class QuantityMeasurementService {

    public String compare(MeasurementQuantity firstValue, MeasurementQuantity secondValue) throws QuantityMeasurementException {
        if (firstValue == null || secondValue == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, "ENTERED NULL VALUE");
        if (firstValue.type != secondValue.type)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.TYPE_MISMATCH, "TYPE MISMATCH");
        return !Objects.equals(firstValue, secondValue) ? "not equal" : "equal";
    }

    public Double addTwoValues(MeasurementQuantity firstValue, MeasurementQuantity secondValue) throws QuantityMeasurementException {
        if (firstValue == null || secondValue == null || firstValue.quantity == null || secondValue.quantity == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, "ENTERED NULL VALUE");
        if (firstValue.type != secondValue.type)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.TYPE_MISMATCH, "Type mismatch");
        return firstValue.quantity + secondValue.quantity;
    }
}