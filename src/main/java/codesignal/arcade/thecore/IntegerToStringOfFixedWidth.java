package codesignal.arcade.thecore;

import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/well-of-integration/kvGfZZxGyjNbD7yxv
 */
public class IntegerToStringOfFixedWidth {
    static String solution(int number, int width) {
        String solution = String.valueOf(number);
        if (solution.length() > width)
            return solution.substring(solution.length() - width);
        else
            return IntStream.range(0, width - solution.length())
                    .mapToObj(value -> "0")
                    .reduce("", String::concat) + solution;
    }

    static String solution2(int number, int width) {
        String s = String.format("%0" + width + "d", number);
        return s.substring(s.length() - width);
    }

}
