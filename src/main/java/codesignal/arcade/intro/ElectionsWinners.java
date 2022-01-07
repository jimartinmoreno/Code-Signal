package codesignal.arcade.intro;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://app.codesignal.com/arcade/intro/level-10/8RiRRM3yvbuAd3MNg
 */
public class ElectionsWinners {
    static int solution(int[] votes, int k) {
        int max = Arrays.stream(votes).max().getAsInt();
        return Arrays.stream(votes)
                .filter(vote -> vote == max || vote + k > max)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)))
                .values().stream()
                .filter(integer -> integer == 1 || k != 0)
                .reduce(Integer::sum).orElse(0);
    }

    static int solution2(int[] votes, int k) {
        int max = Arrays.stream(votes).max().getAsInt();
        return k == 0 ?
                Arrays.stream(votes).filter(x -> x == max).count() == 1
                        ? 1 : 0 : (int) Arrays.stream(votes).filter(x -> x + k > max).count();
    }
}
