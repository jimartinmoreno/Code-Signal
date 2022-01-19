package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseNumbersSumUntil0Test {

    @Test
    void solution() {
        assertEquals(11, HouseNumbersSumUntil0.solution(new int[]{5, 1, 2, 3, 0, 1, 5, 0, 2}));
    }
}