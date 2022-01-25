package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HouseOfCatsAndMansTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{1, 3}, HouseOfCatsAndMans.solution(6));
        assertArrayEquals(new int[]{1}, HouseOfCatsAndMans.solution(2));
        assertArrayEquals(new int[]{0, 2, 4}, HouseOfCatsAndMans.solution(8));
        assertArrayEquals(new int[]{0, 2}, HouseOfCatsAndMans.solution(4));
    }

    @Test
    void solution2() {
        assertArrayEquals(new int[]{1, 3}, HouseOfCatsAndMans.solution2(6));
        assertArrayEquals(new int[]{1}, HouseOfCatsAndMans.solution2(2));
        assertArrayEquals(new int[]{0, 2, 4}, HouseOfCatsAndMans.solution2(8));
        assertArrayEquals(new int[]{0, 2}, HouseOfCatsAndMans.solution2(4));
    }
}