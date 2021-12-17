package mychallenge;

import org.junit.jupiter.api.Test;

import javax.management.InvalidAttributeValueException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * "4556-3646-0793-5616"	"4###-####-####-5616"
 * "64607935616"	"6######5616"
 * ABCD-EFGH-IJKLM-NOPQ	ABCD-EFGH-IJKLM-NOPQ
 * A1234567BCDEFG89HI	A#######BCDEFG89HI
 * "12345"	"12345"	No #s if less than 6 characters
 * ""	""	Make sure to handle empty strings
 * "Skippy"	"Skippy"
 */


class CreditCardTest {

    @Test
    void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
        assertEquals("6######5616", CreditCard.maskify("64607935616"));
        assertEquals("4###-####-####-5616", CreditCard.maskify("4556-3646-0793-5616"));
        assertEquals("A#######BCDEFG89HI", CreditCard.maskify("A1234567BCDEFG89HI"));
        assertEquals("A#!#/(#)[#]^%#6789", CreditCard.maskify("A1!2/(3)[4]^%56789"));
        assertEquals("ABCD-ABCD-ABCD-ABCD", CreditCard.maskify("ABCD-ABCD-ABCD-ABCD"));
        assertEquals("Invalid Format", CreditCard.maskify("############"));

    }

    @Test
    void shouldNotMaskDigitsForShortCreditCards(){
        assertEquals("54321", CreditCard.maskify("54321"));
        assertEquals("Skippy", CreditCard.maskify("Skippy"));
    }

    @Test
    void shouldNotMaskDigitsForNull(){
        assertEquals("", CreditCard.maskify(null));
        assertEquals("", CreditCard.maskify(""));
    }
}