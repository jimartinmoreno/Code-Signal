package codesignal.arcade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvoidObstaclesTest {

    @Test
    void solution() {
        assertEquals(4, AvoidObstacles.solution(new int[]{5, 3, 6, 7, 9}));
        assertEquals(4, AvoidObstacles.solution(new int[]{2, 3}));
        assertEquals(7, AvoidObstacles.solution(new int[]{1, 2, 4, 6, 10}));
        assertEquals(6, AvoidObstacles.solution(new int[]{1000, 999}));
        assertEquals(3, AvoidObstacles.solution(new int[]{19, 32, 11, 23}));
        assertEquals(6, AvoidObstacles.solution(new int[]{5, 8, 9, 13, 14}));
    }

    @Test
    void solution3() {
        assertEquals(4, AvoidObstacles.solution3(new int[]{5, 3, 6, 7, 9}));
        assertEquals(4, AvoidObstacles.solution3(new int[]{2, 3}));
        assertEquals(7, AvoidObstacles.solution3(new int[]{1, 2, 4, 6, 10}));
        assertEquals(6, AvoidObstacles.solution3(new int[]{1000, 999}));
        assertEquals(3, AvoidObstacles.solution3(new int[]{19, 32, 11, 23}));
        assertEquals(6, AvoidObstacles.solution3(new int[]{5, 8, 9, 13, 14}));
    }
}