package codesignal.arcade.thecore;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/code-arcade/loop-tunnel/H5PP5MXvYvWXxTytH
 */
public class Rounders {
    static int solution(int n) {
        int[] numbers = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::valueOf).toArray();

        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] >= 5)
                numbers[i - 1] = numbers[i - 1] + 1;
            numbers[i] = 0;
        }
        System.out.println("numbers = " + Arrays.toString(numbers));
        return Integer.parseInt(Arrays.stream(numbers)
                .mapToObj(String::valueOf).reduce(String::concat)
                .orElse(String.valueOf(n)));
    }

    static int solution3(int value) {
        return value < 10 ? value : value % 10 >= 5 ? solution(value / 10 + 1) * 10 : solution(value / 10) * 10;
    }

    static int solution2(int value) {
        int p = 1;
        while (value > 10) {
            p *= 10;
            value = (value / 10) + ((value % 10 < 5) ? 0 : 1);
        }
        return value * p;
    }
}
