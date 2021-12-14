package mychallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdinalTest {

    @Test
    public void shouldHandleSingleDigits() {
        assertEquals("1st", Ordinal.numberToOrdinal(1));
        assertEquals("2nd", Ordinal.numberToOrdinal(2));
        assertEquals("3rd", Ordinal.numberToOrdinal(3));
        assertEquals("11th", Ordinal.numberToOrdinal(11));
        assertEquals("101st", Ordinal.numberToOrdinal(101));
        assertEquals("111th", Ordinal.numberToOrdinal(111));
        assertEquals("0", Ordinal.numberToOrdinal(0));
        assertEquals("500th", Ordinal.numberToOrdinal(500));
        assertEquals("31st", Ordinal.numberToOrdinal(31));
        assertEquals("42nd", Ordinal.numberToOrdinal(42));
    }
}