package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersGroupingTest {

    @Test
    void solution() {
        assertEquals(11, NumbersGrouping.solution(new int[]{20000, 239, 10001, 999999, 10000, 20566, 29999}));
        assertEquals(3, NumbersGrouping.solution(new int[]{10000, 1}));
    }

    @Test
    void solution2() {
        assertEquals(11, NumbersGrouping.solution2(new int[]{20000, 239, 10001, 999999, 10000, 20566, 29999}));
        assertEquals(3, NumbersGrouping.solution2(new int[]{10000, 1}));
    }

    @Test
    void solution3() {
        assertEquals(11, NumbersGrouping.solution3(new int[]{20000, 239, 10001, 999999, 10000, 20566, 29999}));
        assertEquals(3, NumbersGrouping.solution3(new int[]{10000, 1}));
    }
}