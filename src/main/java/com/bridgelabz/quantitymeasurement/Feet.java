package com.bridgelabz.quantitymeasurement;

public class Feet {
    Double length;

    public Feet(Double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.length, length) == 0;
    }
}
