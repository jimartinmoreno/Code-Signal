package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteValuesSumMinimizationTest {

    @Test
    void solution() {
        assertEquals(4, AbsoluteValuesSumMinimization.solution(new int[]{2, 4, 7}));
        assertEquals(2, AbsoluteValuesSumMinimization.solution(new int[]{2, 3}));
        assertEquals(1, AbsoluteValuesSumMinimization.solution(new int[]{1, 1, 3, 4}));
        assertEquals(500, AbsoluteValuesSumMinimization.solution(new int[]{-10, 100, 200, 500, 300, 400, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 600, 4}));

    }
}