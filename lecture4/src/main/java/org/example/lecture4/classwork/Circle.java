package org.example.lecture4.classwork;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Shape {

    private final Double radius;
    private static final Double NUMBER_OF_CORNERS = Double.NaN;

    @Override
    public Double getArea() {
        return Math.pow(radius, 2) * 3.14;
    }

    public static Double getNumberOfCorners() {
        return NUMBER_OF_CORNERS;
    }
}
