package codesignal.arcade.thecore;

import java.util.Arrays;

public class LateRide {
    static int solution(int n) {
        int h = n / 60;
        int m = n % 60;
        String hours = h == 0 ? "00" : h < 10 ? "0" + h : String.valueOf(h);
        String min = m == 0 ? "00" : m < 10 ? "0" + m : String.valueOf(m);

        StringBuilder sb = new StringBuilder(hours).append(min);
        return Arrays.stream(sb.toString().split("")).mapToInt(Integer::valueOf).sum();
    }

    static int solution2(int n) {
        int hours = n / 60;
        int minutes = n % 60;
        return hours / 10 + hours % 10 + minutes / 10 + minutes % 10;
    }
}
