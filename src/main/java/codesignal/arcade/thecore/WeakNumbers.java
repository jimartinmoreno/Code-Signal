package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/labyrinth-of-nested-loops/oL7YuygJKtMSNLeJn
 */
public class WeakNumbers {
    static int[] solution(int n) {

        int[][] weaknessArr = new int[n][2];
        int maxNumberOfWeakness = 0, numbersMaxWeakness = 0;

        for (int i = 1; i <= n; i++) {
            int weakness = 0, numberOfWeakness = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    weakness++;
            }
            for (int j = 0; j < i; j++) {
                if (weakness < weaknessArr[j][0]) {
                    numberOfWeakness++;
                }
            }

            weaknessArr[i - 1][0] = weakness;
            weaknessArr[i - 1][1] = numberOfWeakness;

            if (numberOfWeakness > maxNumberOfWeakness)
                maxNumberOfWeakness = numberOfWeakness;
        }

        System.out.println("maxNumberOfWeakness = " + maxNumberOfWeakness);
        int finalMaxNumberOfWeakness = maxNumberOfWeakness;
        numbersMaxWeakness = (int) Arrays.stream(weaknessArr).filter(i -> i[1] == finalMaxNumberOfWeakness).count();
        System.out.println("numbersMaxWeakness = " + numbersMaxWeakness);
        return new int[]{maxNumberOfWeakness, numbersMaxWeakness};
    }

    static int[] solution2(int n) {

        List<Integer> weaknessList = IntStream.rangeClosed(1, n)
                .map(a -> (int) IntStream.rangeClosed(1, a).filter(b -> a % b == 0).count())
                .boxed()
                .toList();

        List<Integer> numberWeaknessList = IntStream.rangeClosed(1, n)
                .map(a -> (int) IntStream.rangeClosed(1, a - 1)
                        .filter(b -> weaknessList.get(b - 1) > weaknessList.get(a - 1))
                        .count()).boxed().toList();

        int maxWeakness = numberWeaknessList.stream().mapToInt(Integer::intValue).max().getAsInt();
        int weaknessNumber = (int) numberWeaknessList.stream().filter(x -> x.intValue() == numberWeaknessList.stream()
                .mapToInt(Integer::intValue).max().getAsInt()).count();


        return new int[]{maxWeakness, weaknessNumber};
    }

}
