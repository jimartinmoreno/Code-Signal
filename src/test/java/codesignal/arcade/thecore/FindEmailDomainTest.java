package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindEmailDomainTest {

    @Test
    void solution() {
        assertEquals("example.com", FindEmailDomain.solution("prettyandsimple@example.com"));
        assertEquals("usual.com", FindEmailDomain.solution("\"very.unusual.@.unusual.com\"@usual.com"));

    }

    @Test
    void solution2() {
        assertEquals("example.com", FindEmailDomain.solution2("prettyandsimple@example.com"));
        assertEquals("usual.com", FindEmailDomain.solution2("\"very.unusual.@.unusual.com\"@usual.com"));
    }
}