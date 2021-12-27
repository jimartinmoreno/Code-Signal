package codesignal.arcade.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class PrimeAndFibonacci {

    public static void main(String[] args) {
        primeNumbers();
        fibonacciNumbers();
    }

    static void primeNumbers() {
        Set<Integer> primeList = new TreeSet<>(Set.of(0, 1, 2, 3, 5, 7));
        IntStream.range(0, 100)
                .filter(value -> value % 2 != 0 && value % 3 != 0 && value % 5 != 0 && value % 7 != 0)
                // .dropWhile(value -> value < 60)
                .takeWhile(value -> value < 60)
                .limit(10)
//                .skip(2)
                .forEach(primeList::add);

        System.out.println("primeList = " + primeList);
    }

    static void fibonacciNumbers() {
        List<Integer> fibonacciList = new ArrayList<>(List.of(0, 1));
        IntStream.range(1, 100)
                .limit(15)
                .forEach(i -> fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i - 1)));

        System.out.println("fibonacciList = " + fibonacciList);
    }
}
