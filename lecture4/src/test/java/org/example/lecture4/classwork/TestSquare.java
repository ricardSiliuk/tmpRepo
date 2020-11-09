package org.example.lecture4.classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSquare {

    @Test
    public void assertHasCorrectNumberOfCorners() {
        assertEquals(4, Square.getNumberOfCorners());
    }

    @Test
    public void assertReturnsCorrectArea() {
        Square testObject = new Square(5d);
        assertEquals(25, testObject.getArea());
    }
}