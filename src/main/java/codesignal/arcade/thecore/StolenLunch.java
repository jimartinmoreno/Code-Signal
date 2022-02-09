package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * https://app.codesignal.com/arcade/code-arcade/lab-of-transformations/M97sbwRp3tGy8uAb8
 */
public class StolenLunch {
    static String solution(String note) {
        return Optional.ofNullable(note).stream()
                .filter(Predicate.not(String::isEmpty))
                .flatMap(s -> Arrays.stream(s.split("")))
                .map(s -> Character.isDigit(s.charAt(0)) ? Character.toString(('a' + Integer.parseInt(s))) :
                        Character.isAlphabetic(s.charAt(0)) && (s.charAt(0) - 'a') <= 9 ? String.valueOf(s.charAt(0) - 'a') : s)
                .reduce(String::concat).orElse("");
    }

    static String solution2(String note) {
        char[] res = new char[note.length()];
        int i = 0;
        for (char c : note.toCharArray()) {
            char x = c;
            if (c >= '0' && c <= '9') x += '1';
            else if (c >= 'a' && c <= 'k') x -= '1';
            res[i++] = x;
        }

        return new String(res);
    }
}
