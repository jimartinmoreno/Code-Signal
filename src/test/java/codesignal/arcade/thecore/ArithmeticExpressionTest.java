package codesignal.arcade.thecore;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExpressionTest {

    @Test
    //@DisplayName("solution")
    void solution() {
        assertEquals(true, ArithmeticExpression.solution(2, 3, 5));
        assertEquals(true, ArithmeticExpression.solution(8, 2, 4));
        assertEquals(false, ArithmeticExpression.solution(8, 3, 2));
    }

    @Test
    //@DisplayName("solution2")
    void solution2() {
        assertEquals(true, ArithmeticExpression.solution2(2, 3, 5));
        assertEquals(true, ArithmeticExpression.solution2(8, 2, 4));
        assertEquals(false, ArithmeticExpression.solution2(8, 3, 2));
    }
}