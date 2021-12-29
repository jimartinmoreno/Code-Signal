package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositProfitTest {

    @Test
    void solution() {
        assertEquals(3, DepositProfit.solution(100, 20, 170));
        assertEquals(1, DepositProfit.solution(100, 1, 101));
        assertEquals(6, DepositProfit.solution(1, 100, 64));
    }
}