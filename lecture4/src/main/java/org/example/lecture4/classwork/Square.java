package org.example.lecture4.classwork;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square extends Shape {

    private final Double sideLength;
    private static final Integer NUMBER_OF_CORNERS = 4;

    @Override
    public Double getArea() {
        return sideLength * sideLength;
    }

    public static Integer getNumberOfCorners() {
        return NUMBER_OF_CORNERS;
    }
}
