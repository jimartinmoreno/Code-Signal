package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsProductTest {

    @Test
    void solution() {
        assertEquals(26, DigitsProduct.solution(12));
        assertEquals(-1, DigitsProduct.solution(19));
        assertEquals(10, DigitsProduct.solution(0));
        assertEquals(2559, DigitsProduct.solution(450));
    }
    @Test
    void solution2() {
        assertEquals(26, DigitsProduct.solution2(12));
        assertEquals(-1, DigitsProduct.solution2(19));
        assertEquals(10, DigitsProduct.solution2(0));
        assertEquals(2559, DigitsProduct.solution2(450));
    }
}