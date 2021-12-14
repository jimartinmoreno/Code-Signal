package mychallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        int[] inputArray = new int[]{-23, 4, -3, 8, -12};
        int result = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length - 1; i++) {
            var i1 = inputArray[i] * inputArray[i + 1];
            if (i1 > result)
                result = i1;
        }

        System.out.println("result = " + result);

        System.out.println("result = " + IntStream.range(0, inputArray.length - 1)
                .map(i -> inputArray[i] * inputArray[i + 1])
                .max().getAsInt());

        var n = 2;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
            num = num + (4 * (i - 1));
        }

        int[] inputArray2 = new int[]{6, 2, 3, 8};

        int max = Arrays.stream(inputArray2).max().getAsInt();
        int min = Arrays.stream(inputArray2).min().getAsInt();
        Arrays.sort(inputArray2);
        max = inputArray2[inputArray2.length-1];
        min = inputArray2[0];

        List<Integer> list1 = Arrays.stream(inputArray2).boxed().toList();

        long count = IntStream.range(min, max).filter(value -> !list1.contains(value)).count();
        List newList = IntStream.range(min, max).filter(value -> !list1.contains(value)).mapToObj(value -> Integer.valueOf(value)).toList();
        System.out.println("newList = " + newList);
        System.out.println("count = " + count);

        Arrays.sort(inputArray2);
        System.out.println("inputArray2[inputArray2.length - 1]  = " + inputArray2[inputArray2.length - 1] );
        System.out.println("inputArray2[0]  = " + inputArray2[0] );
        System.out.println("inputArray2[0]  = " + (inputArray2[inputArray2.length - 1] - inputArray2[0]) );
        System.out.println("inputArray2.length + 1  = " + (inputArray2.length + 1) );
        int i = inputArray2[inputArray2.length - 1] - inputArray2[0] - inputArray2.length + 1;
        System.out.println("i = " + i);
    }
}
