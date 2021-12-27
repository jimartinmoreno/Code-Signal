package codesignal.arcade.intro;

import codesignal.arcade.intro.ArrayReplace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReplaceTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{3, 2, 3}, ArrayReplace.solution(new int[]{1, 2, 1}, 1, 3));
    }
}