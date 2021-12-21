package codesignal.arcade;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class AvoidObstacles {
    static int solution(int[] inputArray) {

        System.out.println("Max = " + Arrays.stream(inputArray).max());
        System.out.println("Range = " + IntStream.range(2, Arrays.stream(inputArray).max().getAsInt() + 2));
        return IntStream.range(2, // Salto minimo es 2
                        Arrays.stream(inputArray).max().getAsInt() + 2
                )
                .filter(i ->
                        Arrays.stream(inputArray).allMatch(j -> j % i != 0) // se comprueba que ningun numero es divisible por los saltos
                )
                .min() // recuperamos el minimo de los que han cumplido la condición
                .getAsInt();
    }

    static int solution3(int[] inputArray) {

        int jump = 1;
        boolean fail = true;

        while (fail) {
            jump++;
            fail = false;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % jump == 0) {
                    fail = true;
                    break;
                }
            }
        }

        return jump;
    }

    static int solution2(int[] inputArray) {
        // Insert all array elements in a hash table
        // and find the maximum value in the array
        HashSet<Integer> hs = new HashSet<Integer>();
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            hs.add(inputArray[i]);
            max = Math.max(max, inputArray[i]);
        }

        // checking for every possible length which yield us solution
        for (int i = 1; i <= max; i++) {
            int j;
            for (j = i; j <= max; j = j + i) {

                // if there is obstacle, break the loop.
                if (hs.contains(j))
                    break;
            }

            // If above loop did not break
            if (j > max)
                return i;
        }

        return max + 1;
    }

}
