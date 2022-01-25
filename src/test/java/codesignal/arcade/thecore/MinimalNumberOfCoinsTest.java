package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimalNumberOfCoinsTest {

    @Test
    void solution() {
        assertEquals(6, MinimalNumberOfCoins.solution(new int[]{1, 2, 10}, 28));
        assertEquals(10, MinimalNumberOfCoins.solution(new int[]{1, 5, 10, 100}, 239));
    }
}