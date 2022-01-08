package codesignal.arcade.intro;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class LineEncoding {
    static String solution(String s) {
        String temp = String.valueOf(s.charAt(0));
        temp += IntStream.range(1, s.length())
                .mapToObj(i -> s.charAt(i) != s.charAt(i - 1) ?
                        "_".concat(String.valueOf(s.charAt(i))) : String.valueOf(s.charAt(i)))
                .reduce("", (s1, s2) -> s1 + s2);


        temp = Arrays.stream(temp.split("_"))
                .map(s1 -> (s1.length() > 1 ? String.valueOf(s1.length()) : "").concat(String.valueOf(s1.charAt(0))))
                .reduce("", (s1, s2) -> s1 + s2);
        System.out.println("temp2 = " + temp);
        return temp;
    }

    static String solution2(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        s += ' ';
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) count++;
            else {
                if (count > 1) {
                    result.append(count);
                }
                result.append(s.charAt(i - 1));
                count = 1;
            }
        }
        return result.toString();
    }

    static String solution3(String s) {
        Matcher m = Pattern.compile("([a-z])\\1*").matcher(s);
        String result = "";
        while (m.find()) {
            int len = m.group(0).length();
            char cha = m.group(0).charAt(0);
            result += (len == 1 ? "" : len) + "" + cha;
        }
        return result;
    }

}
