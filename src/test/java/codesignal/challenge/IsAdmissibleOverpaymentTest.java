package codesignal.challenge;

import codesignal.challenge.IsAdmissibleOverpayment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsAdmissibleOverpaymentTest {

    @Test
    void solution() {
        assertEquals(true, IsAdmissibleOverpayment
                .solution(new double[]{110, 95, 70},
                        new String[]{"10.0% higher than in-store", "5.0% lower than in-store", "Same as in-store"},
                        5));

        assertEquals(false, IsAdmissibleOverpayment
                .solution(new double[]{48, 165},
                        new String[]{"20.00% lower than in-store", "10.00% higher than in-store"},
                        2));
    }

    @Test
    void solution2() {
        assertEquals(true, IsAdmissibleOverpayment
                .solution2(new double[]{110, 95, 70},
                        new String[]{"10.0% higher than in-store", "5.0% lower than in-store", "Same as in-store"},
                        5));

        assertEquals(false, IsAdmissibleOverpayment
                .solution2(new double[]{48, 165},
                        new String[]{"20.00% lower than in-store", "10.00% higher than in-store"},
                        2));
    }
}