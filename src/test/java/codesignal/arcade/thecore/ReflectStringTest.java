package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReflectStringTest {

    @Test
    void solution() {
        assertEquals("mznv", ReflectString.solution("name"));
        assertEquals("zyba", ReflectString.solution("abyz"));
        assertEquals("mmmmm", ReflectString.solution("nnnnn"));
    }
}