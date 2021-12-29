package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractEachKthTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 7, 8, 10}, ExtractEachKth.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3));
    }

    @Test
    void solution2() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 7, 8, 10}, ExtractEachKth.solution2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3));
    }
}