package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackLightTest {

    @Test
    void solution() {
        assertEquals(10, KnapsackLight.solution(10, 5, 6, 4, 8));
        assertEquals(16, KnapsackLight.solution(10, 5, 6, 4, 9));
        assertEquals(7, KnapsackLight.solution(5, 3, 7, 4, 6));
        assertEquals(3, KnapsackLight.solution(3, 5, 3, 8, 10));
    }
    @Test
    void solution2() {
        assertEquals(10, KnapsackLight.solution2(10, 5, 6, 4, 8));
        assertEquals(16, KnapsackLight.solution2(10, 5, 6, 4, 9));
        assertEquals(7, KnapsackLight.solution2(5, 3, 7, 4, 6));
        assertEquals(3, KnapsackLight.solution2(3, 5, 3, 8, 10));
    }
    @Test
    void solution3() {
        assertEquals(10, KnapsackLight.solution3(10, 5, 6, 4, 8));
        assertEquals(16, KnapsackLight.solution3(10, 5, 6, 4, 9));
        assertEquals(7, KnapsackLight.solution3(5, 3, 7, 4, 6));
        assertEquals(3, KnapsackLight.solution3(3, 5, 3, 8, 10));
    }
}