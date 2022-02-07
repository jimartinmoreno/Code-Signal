package codesignal.arcade.thecore;

import java.util.Arrays;

public class ReflectString {

    static String solution(String inputString) {
        return Arrays.stream(inputString.split(""))
                .map(s -> Character.toString((122 - ((int) s.charAt(0) - 97))))
                .reduce(String::concat).orElse("");
    }
}
