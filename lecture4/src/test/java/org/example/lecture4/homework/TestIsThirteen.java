package org.example.lecture4.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestIsThirteen {

    @Test
    public void assertFloatIsThirteen() {
        assertTrue(IsThirteen.isThirteen(13f));
        assertFalse(IsThirteen.isThirteen(12f));
    }

    @Test
    public void assertThirteenInList() {
        Long a = 13L;
        assertTrue(IsThirteen.containsThirteen(List.of(1, 2, 3, 1)));
        List<Integer> myList = new ArrayList<>(); myList.add(1); myList.add(2);
    }

}