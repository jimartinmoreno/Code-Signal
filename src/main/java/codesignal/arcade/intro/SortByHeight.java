package codesignal.arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortByHeight {

    static int[] solution(int[] a) {
        int [] trees = IntStream.range(0, a.length).filter(i -> a[i] == -1).toArray();

        List<Integer> orderedList = new ArrayList<>(Arrays.stream(a).filter(i -> i != -1).sorted().boxed().toList());

        Arrays.stream(trees).boxed().forEach(pos -> {
            orderedList.add(pos, -1);
        });
        System.out.println("orderedList = " + orderedList);
        return orderedList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int [] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        solution(a);
    }
}
