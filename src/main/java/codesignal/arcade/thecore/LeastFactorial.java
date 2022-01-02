package codesignal.arcade.thecore;

import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/loop-tunnel/7BFPq6TpsNjzgcpXy
 */

public class LeastFactorial {
    static int solution2(int n) {
        int accumulator = 1;
        for (int i = 1; accumulator <= n; i++) {
            accumulator = accumulator * i;
        }
        return accumulator;
    }

    static int solution(int n) {
        return IntStream.range(1, n)
                .reduce(1, (left, right) -> left < n ? left * right : left);
    }
}
