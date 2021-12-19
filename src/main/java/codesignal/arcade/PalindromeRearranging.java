package codesignal.arcade;

import java.util.HashSet;
import java.util.Set;

public class PalindromeRearranging {

    static boolean solution2(String inputString) {
        Set<Character> chars = new HashSet<>();

        for (int i = 0; i < inputString.length(); ++i) {
            char c = inputString.charAt(i);
            if (chars.contains(c)) {
                chars.remove(c);
            } else {
                chars.add(c);
            }
        }
        return chars.size() <= 1 ? true : false;
    }

    static boolean solution(String inputString) {
        Set<Character> characterSet = new HashSet<>();

        inputString.chars().forEach(c -> {
            if (characterSet.contains((char)c)) {
                characterSet.remove((char)c);
            } else {
                characterSet.add((char) c);
            }
        });

        System.out.println("characterSet = " + characterSet);
        return characterSet.size() <= 1 ? true : false;
    }


    public static void main(String[] args) {
        System.out.println("true = " + solution("aabb"));
        System.out.println("true = " + solution("abbcabb"));
        System.out.println("false = " + solution("abbssdfgdfgdfcabb"));
    }


}
