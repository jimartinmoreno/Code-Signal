package codesignal.arcade.intro;

import java.util.HashMap;
import java.util.Map;

public class AbsoluteValuesSumMinimization {

    static int solution(int[] a) {
        int minSum = Integer.MAX_VALUE, minNumber = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += Math.abs(a[j] - a[i]);
            }
            if (sum < minSum) {
               minNumber = a[i];
               minSum = sum;
            }
        }
        System.out.println("minNumber = " + minNumber);
        System.out.println("minSum = " + minSum);
        return minNumber;
    }

    static int solution2(int[] a) {
        int val = Integer.MAX_VALUE, sum = 0, res = 0;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += Math.abs(a[j] - a[i]);
            }
            if (sum < val) {
                res = a[i];
                val = sum;
            }
        }
        return res;
    }

    static int solution3(int[] A) {
        System.out.println("solution = " + A[(A.length - 1) / 2]);
        return A[(A.length - 1) / 2];
    }
}
