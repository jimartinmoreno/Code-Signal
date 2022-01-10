package codesignal.arcade.intro;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/intro/level-12/sCpwzJCyBy2tDSxKW
 */
public class MessageFromBinaryCode {
    static String solution(String code) {
        System.out.println("code = " + code);
        char nextChar;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= code.length() - 8; i += 8) {
            nextChar = (char) Integer.parseInt(code.substring(i, i + 8), 2);
            sb.append(nextChar);
        }
        return sb.toString();
    }

    static String solution2(String code) {
        return String.join("", IntStream.range(0, code.length())
                .filter(i -> i % 8 == 0)
                .mapToObj(i -> Character.toString((char) Integer.parseInt(code.substring(i, i + 8), 2)))
                .toArray(String[]::new));
    }

    static String solution3(String code) {
        return new String(new BigInteger(code, 2).toByteArray());
    }
}
