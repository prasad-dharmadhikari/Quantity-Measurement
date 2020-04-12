package com.bridgelabz.quantitymeasurement.utility;

import java.util.Objects;

public class MeasurementQuantity {
    public Double quantity;
    public MeasurementType type;

    public MeasurementQuantity(Double quantity, MeasurementUnit unit, MeasurementType type) {
        this.quantity = unit.convertToBaseValue(quantity);
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementQuantity measurementQuantity1 = (MeasurementQuantity) o;
        return Objects.equals(quantity, measurementQuantity1.quantity);
    }
}
