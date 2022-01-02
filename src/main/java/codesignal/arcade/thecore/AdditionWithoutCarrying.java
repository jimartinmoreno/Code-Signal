package codesignal.arcade.thecore;

import java.util.stream.Stream;

/**
 * https://app.codesignal.com/arcade/code-arcade/loop-tunnel/xzeZqCQjpfDJuN72S
 */
public class AdditionWithoutCarrying {
    static int solution(int param1, int param2) {
        String p1 = String.valueOf(param1);
        String p2 = String.valueOf(param2);
        int maxLength = Stream.of(p1, p2).mapToInt(String::length).max().orElse(0);
        String[] pArr1 = aux(p1, maxLength);
        String[] pArr2 = aux(p2, maxLength);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            int temp = Integer.valueOf(pArr1[i]) + Integer.valueOf(pArr2[i]);
            sb.append(temp % 10);
        }
        System.out.println("solution = " + sb);
        return Integer.valueOf(sb.toString());
    }


    static String[] aux(String s, int length) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - s.length()) {
            sb.append('0');
        }
        return sb.append(s).toString().split("");
    }

    static int solution2(int param1, int param2) {
        if (param1 == 0 || param2 == 0) {
            return param1 + param2;
        }
        return solution2(param1 / 10, param2 / 10) * 10 + (param1 + param2) % 10;
    }

    static int solution3(int param1, int param2) {
        int t = 0;
        int mult = 1;
        while (param1 + param2 > 0) {
            int value = (param1 + param2) % 10;
            t += value * mult;
            mult *= 10;
            param1 /= 10;
            param2 /= 10;
        }
        return t;
    }
}
