package mychallenge;

import java.util.Optional;

public class Ordinal {
    private static String[] suffixes = new String[]{"th", "st", "nd", "rd", "th"};

    static String numberToOrdinal(Integer number) {
        Optional<String> integerOptional = Optional.ofNullable(number).map(Ordinal::getOrdinal);
        return integerOptional.orElse("Invalid number");
    }

    private static String getOrdinal(Integer number) {
        var sb = new StringBuilder();
        var tmp10 = number % 10;
        var tmp100 = number % 100;

        if (number == 0) {
            sb.append(number);
        } else {
            if (number <= 4) {
                sb.append(number).append(suffixes[number]);
            } else {
                switch (tmp100) {
                    case 11, 12, 13 -> sb.append(number).append("th");
                    default -> {
                        if (tmp10 <= 4) {
                            sb.append(number).append(suffixes[tmp10]);
                        } else {
                            sb.append(number).append("th");
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // int[] tests = {0, 1, 2, 3, 4, 5, 10, 11, 12, 13, 18, 21, 22, 23, 31, 41, 111, 200, 500};
        // int[] tests = {0, 1, 2, 3, 4, 5, 10, 11, 18, 21, 22, 23, 28, 31, 32, 33, 38, 41, 42, 101, 111, 112, 201, 211, 212};
        int[] tests = {5, 10, 11, 21, 22, 23, 28, 31, 32, 33, 38, 41, 42, 101, 111,
                112, 113, 201, 202, 203, 211, 212, 213, 221, 222};
        for (int test : tests) {
            System.out.println(numberToOrdinal(test));
        }
    }
}
