package codesignal.arcade.intro;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://app.codesignal.com/arcade/intro/level-8/rRGGbTtwZe2mA8Wov
 */

public class FirstDigit {

    static char solution2(String inputString) {
        Matcher matcher = Pattern.compile("\\d+").matcher(inputString);
        matcher.find();
        String i = matcher.group();
        System.out.println("i = " + i);
        return i.charAt(0);
    }

    static char solution(String inputString) {

        String i = Arrays.stream(inputString.split(""))
                .filter(s -> Character.isDigit(s.charAt(0)))
                .findFirst().get();
        System.out.println("i = " + i);
        return i.charAt(0);
    }
}
