package org.example;

import java.util.Objects;

public class Laptop {
    private final String name;
    private final int ram;
    private final int storage;
    private final String os;
    private final String color;
    private final double diagonal;

    public Laptop(String name, int ram, int storage, String os, String color, double diagonal) {
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("Laptop{");
        stringBuffer.append("name='").append(name).append('\'');
        stringBuffer.append(", ram=").append(ram);
        stringBuffer.append(", storage=").append(storage);
        stringBuffer.append(", os='").append(os).append('\'');
        stringBuffer.append(", color='").append(color).append('\'');
        stringBuffer.append(", diagonal=").append(diagonal);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && storage == laptop.storage && Double.compare(diagonal, laptop.diagonal) == 0 && Objects.equals(name, laptop.name) && Objects.equals(os, laptop.os) && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ram, storage, os, color, diagonal);
    }

    public int getRam() {
        return this.ram;
    }

    public int getStorage() {
        return this.storage;
    }

    public String getOS() {
        return this.os;
    }

    public double getDiagonal() {
        return this.diagonal;
    }
}
