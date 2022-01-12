package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsTandemRepeatTest {

    @Test
    void solution() {
        assertEquals(true, IsTandemRepeat.solution("tandemtandem"));
        assertEquals(true, IsTandemRepeat.solution("aa"));
        assertEquals(false, IsTandemRepeat.solution("qqq"));
        assertEquals(false, IsTandemRepeat.solution("2w2ww"));
        assertEquals(true, IsTandemRepeat.solution("tesTtesTtesTtesT"));
        assertEquals(true, IsTandemRepeat.solution("AAAAAA"));
    }

    @Test
    void solution2() {
        assertEquals(true, IsTandemRepeat.solution2("tandemtandem"));
        assertEquals(true, IsTandemRepeat.solution2("aa"));
        assertEquals(false, IsTandemRepeat.solution2("qqq"));
        assertEquals(false, IsTandemRepeat.solution2("2w2ww"));
        assertEquals(true, IsTandemRepeat.solution2("tesTtesTtesTtesT"));
        assertEquals(true, IsTandemRepeat.solution2("AAAAAA"));
    }

    @Test
    void solution3() {
        assertEquals(true, IsTandemRepeat.solution3("tandemtandem"));
        assertEquals(true, IsTandemRepeat.solution3("aa"));
        assertEquals(false, IsTandemRepeat.solution3("qqq"));
        assertEquals(false, IsTandemRepeat.solution3("2w2ww"));
        assertEquals(true, IsTandemRepeat.solution3("tesTtesTtesTtesT"));
        assertEquals(true, IsTandemRepeat.solution3("AAAAAA"));
    }
}