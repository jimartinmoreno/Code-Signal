package codesignal.arcade.thecore;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/code-arcade/well-of-integration/x3ix7CY93z2bwKDtG
 */

public class SwitchCandles {

    static int[] solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
                for (int j = 0; j < i; j++) {
                    //a[j] = a[j] == 1 ? 0 : 1;
                    a[j] = Math.abs(a[j] - 1);
                }
            }
        }
        System.out.println("a2 = " + Arrays.toString(a));
        return a;
    }
}
