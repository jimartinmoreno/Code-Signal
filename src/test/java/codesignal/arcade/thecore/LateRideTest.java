package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LateRideTest {

    @Test
    void solution() {
        assertEquals(4, LateRide.solution(240));
        assertEquals(14, LateRide.solution(808));
    }

    @Test
    void solution2() {
        assertEquals(4, LateRide.solution2(240));
        assertEquals(14, LateRide.solution2(808));
    }
}