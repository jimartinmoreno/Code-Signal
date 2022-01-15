package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HTMLEndTagByStartTagTest {

    @Test
    void solution() {
        assertEquals("</button>", HTMLEndTagByStartTag.solution("<button type='button' disabled>"));
        assertEquals("</i>", HTMLEndTagByStartTag.solution("<i>"));
    }
    @Test
    void solution2() {
        assertEquals("</button>", HTMLEndTagByStartTag.solution2("<button type='button' disabled>"));
        assertEquals("</i>", HTMLEndTagByStartTag.solution2("<i>"));
    }
}