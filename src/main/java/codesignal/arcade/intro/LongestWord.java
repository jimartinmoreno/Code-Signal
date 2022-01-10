package codesignal.arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://app.codesignal.com/arcade/intro/level-12/s9qvXv4yTaWg8g4ma
 */
public class LongestWord {
    static String solution(String text) {
        System.out.println("text = " + text);
        Pattern PATTERN = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = PATTERN.matcher(text);
        List<String> wordList = new ArrayList<>();
        while (matcher.find()) wordList.add(matcher.group());
        return wordList.stream().max(Comparator.comparingInt(String::length)).orElse("");
    }

    static String solution2(String text) {
        return Arrays.stream(text.split("\\W+")).max(Comparator.comparingInt(String::length)).orElse("");
    }

    static String solution3(String text) {
        var s = text.split("[^a-zA-Z]");
        String t = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > t.length())
                t = s[i];
        }
        return t;
    }
}
