package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneCallTest {

    @Test
    void solution() {
        assertEquals(14, PhoneCall.solution(3, 1, 2, 20));
        assertEquals(1, PhoneCall.solution(2, 2, 1, 2));
        assertEquals(10, PhoneCall.solution(10, 1, 2, 20));
        assertEquals(11, PhoneCall.solution(10, 1, 2, 22));
    }
}