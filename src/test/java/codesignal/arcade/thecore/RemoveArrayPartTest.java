package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveArrayPartTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 3, 5}, RemoveArrayPart.solution(new int[]{2, 3, 2, 3, 4, 5}, 2, 4));
    }

    @Test
    void solution2() {
        assertArrayEquals(new int[]{2, 3, 5}, RemoveArrayPart.solution2(new int[]{2, 3, 2, 3, 4, 5}, 2, 4));
    }
}