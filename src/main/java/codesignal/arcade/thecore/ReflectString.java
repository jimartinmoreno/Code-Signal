package codesignal.arcade.thecore;

import java.util.Arrays;

public class ReflectString {

    static String solution(String inputString) {
        return Arrays.stream(inputString.split(""))
                .map(s -> Character.toString(('z' - (s.charAt(0) - 'a'))))
                .reduce(String::concat).orElse("");
    }
}
