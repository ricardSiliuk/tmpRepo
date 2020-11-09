package org.example.lecture4.classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCircle {

    private Circle testObject = new Circle(5d);

    @Test
    public void assertHasInfiniteCorners() {
        assertEquals(Double.NaN, Circle.getNumberOfCorners());
    }

    @Test
    public void assertCorrectArea() {
        assertEquals(3.14 * 5 * 5, testObject.getArea());
    }
}