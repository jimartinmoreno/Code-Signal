package codesignal.arcade.thecore;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/mirror-lake/EeKpdMQXpBkgWjcvt
 */
public class ConstructSquare {

    static int solution(String s) {
        System.out.println("s = " + s);
        List<Long> charsFrequency = getCharsFrequency(s);

        System.out.println("charsFrequency = " + charsFrequency);
        System.out.println("Max number = " + (int) Math.pow(10, s.length()));

        return IntStream.iterate((int) Math.pow(10, s.length()) - 1, i -> i - 1)
                .limit((int) Math.pow(10, s.length()) - 1)
                .map(i -> Math.pow((int) Math.sqrt(i), 2) == i ? i : 0)
                .filter(value -> value != 0
                        && String.valueOf(value).length() == s.length()
                        && charsFrequency.equals(getCharsFrequency(String.valueOf(value))))
                .findFirst().orElse(-1);
    }


    static int solution2(String s) {
        List<Long> charsFrequency = getCharsFrequency(s);
        int largestSquare = 0;
        for (int i = 0; i < s.length(); i++) {
            largestSquare = largestSquare * 10 + 9;
        }

        for (int i = (int) Math.sqrt(largestSquare); i > 0; i--) {
            int squareNum = (int) Math.pow(i, 2);
            if (charsFrequency.equals(getCharsFrequency(String.valueOf(squareNum)))) {
                return squareNum;
            }
        }
        return -1;
    }

    static List<Long> getCharsFrequency(String s) {
        return s.chars()
                .boxed()
                .collect(Collectors
                        .collectingAndThen(Collectors.groupingBy(i -> i, Collectors.counting()),
                                map -> map.values()
                                        .stream()
                                        .sorted()
                                        .toList()));
    }
}
