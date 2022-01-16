package mychallenge;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreditCardTestNG {

    @Test
    public void testMaskify() {
        assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
    }
}