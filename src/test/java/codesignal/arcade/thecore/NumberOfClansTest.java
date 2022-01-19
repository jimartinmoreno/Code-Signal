package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://app.codesignal.com/arcade/code-arcade/mirror-lake/BLbGNY3kEcvKjBCFC
 */
class NumberOfClansTest {

    @Test
    void solution() {
        assertEquals(4, NumberOfClans.solution(new int[]{2, 3}, 6));
        assertEquals(5, NumberOfClans.solution(new int[]{2, 3, 4}, 6));
        assertEquals(2, NumberOfClans.solution(new int[]{1, 3}, 10));
    }

    @Test
    void solution2() {
        assertEquals(4, NumberOfClans.solution2(new int[]{2, 3}, 6));
        assertEquals(5, NumberOfClans.solution2(new int[]{2, 3, 4}, 6));
        assertEquals(2, NumberOfClans.solution2(new int[]{1, 3}, 10));
    }

}