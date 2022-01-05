package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsBeautifulStringTest {

    @Test
    void solution() {
        assertEquals(true, IsBeautifulString.solution("bbbaacdafe"));
        assertEquals(false, IsBeautifulString.solution("bbbaa"));
        assertEquals(false, IsBeautifulString.solution("bbc"));
    }

    @Test
    void solution2() {
        assertEquals(true, IsBeautifulString.solution2("bbbaacdafe"));
        assertEquals(false, IsBeautifulString.solution2("bbbaa"));
        assertEquals(false, IsBeautifulString.solution2("bbc"));
    }
}