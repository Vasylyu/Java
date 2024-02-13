package org.example.lesson_12;

import java.util.Objects;

public class Cube {
    private Integer lenght;
    private String color;

    private String material;

    public Cube(Integer lenght, String color, String material) {
        this.lenght = lenght;
        this.color = color;
        this.material = material;
    }

    public Cube() {
    }

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "lenght=" + lenght +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public int getVolume() {
        return (int)Math.pow( lenght, 3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Objects.equals(lenght, cube.lenght) && Objects.equals(color, cube.color) && Objects.equals(material, cube.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, color, material);
    }
}
