package codesignal.arcade.intro;

import java.util.HashSet;

/**
 * https://app.codesignal.com/arcade/intro/level-8/8N7p3MqzGQg5vFJfZ
 */
public class DifferentSymbolsNaive {
    static int solution(String s) {
        long distintChars = s.chars().distinct().count();
        System.out.println("distintChars = " + distintChars);
        return (int) distintChars;
    }

    static int solution2(String s) {
        HashSet h = new HashSet();
        for (char c : s.toCharArray()) {
            h.add(c);
        }
        return h.size();
    }

}
