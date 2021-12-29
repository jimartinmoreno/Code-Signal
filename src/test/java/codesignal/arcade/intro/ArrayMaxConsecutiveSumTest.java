package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxConsecutiveSumTest {

    @Test
    void solution() {
        assertEquals(8, ArrayMaxConsecutiveSum.solution(new int[]{2, 3, 5, 1, 6}, 2));
    }
}