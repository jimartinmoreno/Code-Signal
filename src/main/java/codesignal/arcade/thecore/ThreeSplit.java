package codesignal.arcade.thecore;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/code-arcade/well-of-integration/QmK8kHTyKqh8xDoZk
 */
public class ThreeSplit {
    static int solution(int[] a) {
        long third = Arrays.stream(a).mapToLong(value -> value).sum() / 3;
        System.out.println("third = " + third);

        long sum1 = 0, sum2 = 0, count = 0;

        /**
         * Solo se itera 2 veces por esta condición: It is guaranteed that the sum of all elements in the array is divisible by 3
         * Lo que implica que si los 2 primeros segmentos suman lo mismo el resto de elementos suma tambien eso
         */
        for (int i = 0; i < a.length - 2; i++) {
            sum1 += a[i];
            if (sum1 == third) {
                sum2 = 0;
                for (int j = i + 1; j < a.length - 1; j++) {
                    sum2 += a[j];
                    if (sum2 == third) {
                        count++;
                    }
                }
            }
        }
        System.out.println("count = " + count);
        return (int) count;
    }


    static int solution2(int[] a) {
        long third = Arrays.stream(a).mapToLong(value -> value).sum() / 3, numOfCuts = 0, currSum = 0, ans = 0;
        for (int i = 0; i < a.length - 1; i++) {
            currSum += a[i];
            if (currSum == 2 * third)
                ans += numOfCuts;
            if (currSum == third)
                numOfCuts++;
        }
        return (int) ans;
    }

}
