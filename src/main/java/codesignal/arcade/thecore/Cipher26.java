package codesignal.arcade.thecore;

import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/lab-of-transformations/JeDDnToFtitiiWDZn
 */
public class Cipher26 {

    static String solution(String message) {
        var sb = new StringBuilder();
        sb.append(message.charAt(0));
        IntStream.range(1, message.length())
                .forEach(i -> {
                    sb.append((char) ((message.charAt(i) - message.charAt(i - 1) + 26) % 26 + 'a'));
                });
        return sb.toString();
    }

    static String solution3(String message) {
        var ans = new StringBuilder();
        ans.append(message.charAt(0));
        for (int i = 1; i < message.length(); i++) {
            ans.append((char) ((message.charAt(i) - message.charAt(i - 1) + 26) % 26 + 'a'));
        }
        return ans.toString();
    }

    static String solution2(String message) {
        String result = "";
        char[] charr = message.toCharArray();
        int sub = 0, prev = 0;
        for (int i = 0; i < message.length(); i++) {
            int t = (charr[i] - 'a');
            sub = t - prev;
            if (sub < 0) sub = sub + 26;
            result += (char) (sub + 'a');
            prev = t;
        }
        return result;
    }
}
