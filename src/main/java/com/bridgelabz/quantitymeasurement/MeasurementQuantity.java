package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class MeasurementQuantity {
    Double quantity;

    public MeasurementQuantity(Double quantity, MeasurementUnit unit) {
        this.quantity = unit.convertToBaseValue(quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementQuantity measurementQuantity1 = (MeasurementQuantity) o;
        return Objects.equals(quantity, measurementQuantity1.quantity);
    }

}
