package mychallenge;

import org.junit.jupiter.api.Test;

import javax.management.InvalidAttributeValueException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CreditCardTest {

    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
        assertEquals("6######5616", CreditCard.maskify("64607935616"));
    }

    @Test
    public void shouldNotMaskDigitsForShortCreditCards(){
        assertEquals("54321", CreditCard.maskify("54321"));
    }

    @Test
    public void shouldNotMaskDigitsForNull(){
        assertEquals("", CreditCard.maskify(null));
        assertEquals("", CreditCard.maskify(""));
    }
}