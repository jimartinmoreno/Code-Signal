package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrowingPlantTest {

    @Test
    void solution() {
        assertEquals(10, GrowingPlant.solution(100, 10, 910));
        assertEquals(1, GrowingPlant.solution(10, 9, 4));
        assertEquals(5, GrowingPlant.solution(6, 5, 10));
    }
}