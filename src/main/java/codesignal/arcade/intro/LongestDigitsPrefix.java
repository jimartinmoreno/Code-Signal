package codesignal.arcade.intro;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/intro/level-8/Rqvw3daffNE7sT7d5
 */
public class LongestDigitsPrefix {
    static String solution(String inputString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i)))
                sb.append(inputString.charAt(i));
            else
                break;
        }
        return sb.toString();
    }

    static String solution2(String inputString) {
        //return inputString.replaceAll("^(\\d*).*", "$1");
        return inputString.replaceAll("\\D.*", "");
    }

    static String solution3(String st) {
        String s = String.join("", Arrays.stream(st.split(""))
                .map(i -> Character.isDigit(i.charAt(0)) ? i : "-").toArray(String[]::new));
        return s.contains("-") ? s.substring(0, s.indexOf("-")) : s;
    }


}
