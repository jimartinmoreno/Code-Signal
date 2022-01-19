package codesignal.arcade.thecore;


import java.util.*;
import java.util.stream.IntStream;

public class NumberOfClans {
    static int solution(int[] divisors, int k) {
        Set<List<Integer>> clanSet = new HashSet<>();
        List<Integer> divisorsList;

        for (int i = 1; i <= k; i++) {
            divisorsList = new ArrayList<>();
            for (int divisor : divisors) {
                if (i % divisor == 0)
                    divisorsList.add(divisor);
            }
            clanSet.add(divisorsList);
        }
        System.out.println("clanSet = " + clanSet);

        return clanSet.size();
    }

    static int solution2(int[] divisors, int k) {
        Set<List<Integer>> clanSet = new HashSet<>(
                IntStream.rangeClosed(1, k)
                        .mapToObj(i -> Arrays.stream(divisors)
                                .filter(j -> i % j == 0)
                                .boxed()
                                .toList())
                        .toList()
        );
        System.out.println("clanSet = " + clanSet);
        return clanSet.size();
    }
}
