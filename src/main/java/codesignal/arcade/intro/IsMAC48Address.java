package codesignal.arcade.intro;

import java.util.Arrays;

public class IsMAC48Address {
    static boolean solution(String inputString) {
        String[] segments = inputString.split("-");

        if (inputString.length() != 17 || segments.length != 6)
            return false;

        return Arrays.stream(segments).map(s -> s.matches("[A-F0-9]+"))
                //.peek(System.out::println)
                .allMatch(aBoolean -> aBoolean == true);
    }

    static boolean solution2(String inputString) {
        return inputString.matches("^([0-9A-F][0-9A-F]-){5}[0-9A-F][0-9A-F]$");
    }

    static boolean solution3(String inputString) {
        return inputString.matches("([0-9A-F]{2}-){5}[0-9A-F]{2}");
    }
}
