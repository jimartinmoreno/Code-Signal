package codesignal.arcade;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MakeArrayConsecutive {
    int solution(int[] statues) {
        int max = Arrays.stream(statues).max().getAsInt();
        int min = Arrays.stream(statues).min().getAsInt();

        List<Integer> list1 = Arrays.stream(statues).boxed().toList();

        long count = IntStream.range(min, max).filter(value -> !list1.contains(value)).count();
        return Long.valueOf(count).intValue();
    }

    int solution2(int[] statues) {
        Arrays.sort(statues);
        var max = statues[statues.length-1];
        var min = statues[0];

        List<Integer> list1 = Arrays.stream(statues).boxed().toList();

        long count = IntStream.range(min, max).filter(value -> !list1.contains(value)).count();
        List newList = IntStream.range(min, max).filter(value -> !list1.contains(value)).mapToObj(value -> Integer.valueOf(value)).toList();
        List newList2 = IntStream.range(min, max).filter(value -> !list1.contains(value)).boxed().toList();

        System.out.println("newList = " + newList);
        System.out.println("newList2 = " + newList2);
        System.out.println("count = " + count);

        return Long.valueOf(count).intValue();
    }

    int solution3(int[] statues) {
        Arrays.sort(statues);
        int numberOfToBeElements = statues[statues.length-1] - statues[0];
        return numberOfToBeElements - statues.length + 1;
    }
}
