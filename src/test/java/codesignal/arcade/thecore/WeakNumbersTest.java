package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeakNumbersTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 2}, WeakNumbers.solution(9));
    }

    @Test
    void solution2() {
        assertArrayEquals(new int[]{2, 2}, WeakNumbers.solution2(9));
    }
}