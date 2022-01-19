package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AllLongestStringsTest {

    @Test
    void solution() {
        assertArrayEquals(new String[]{"aba", "vcd", "aba"}, AllLongestStrings.solution(new String[]{"aba", "aa", "ad", "vcd", "aba"}));
    }
}