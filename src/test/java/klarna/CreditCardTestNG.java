package klarna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTestNG {

    @Test
    public void testMaskify() {
        assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
    }
}