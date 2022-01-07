package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codesignal.com/arcade/code-arcade/labyrinth-of-nested-loops/MvX84CA5HN6GKqv7R
 */
public class SquareDigitsSequence {

    static int solution(int a0) {

        int temp = a0;
        String number = null;
        int[] digits1 = null;

        Set<Integer> squaredDigits = new HashSet<>();
        squaredDigits.add(a0);

        while (true) {
            number = String.valueOf(temp);
            digits1 = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
            temp = (int) Math.pow(digits1[0], 2);
            for (int i = 1; i < digits1.length; i++) {
                temp += (int) Math.pow(digits1[i], 2);
            }
            if (!squaredDigits.add(temp))
                break;
        }
        System.out.println("solution = " + (squaredDigits.size() + 1));
        return squaredDigits.size() + 1;
    }

}
