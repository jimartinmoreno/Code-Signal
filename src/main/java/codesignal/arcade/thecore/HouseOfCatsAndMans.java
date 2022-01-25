package codesignal.arcade.thecore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://app.codesignal.com/arcade/code-arcade/well-of-integration/RaWLwT2eb96hp4N5Z
 */
public class HouseOfCatsAndMans {

    static int[] solution(int legs) {
        return IntStream
                .rangeClosed(0, legs / 2)
                .filter(i -> (legs - 2 * i) % 4 == 0)
                .toArray();
    }

    static int[] solution2(int legs) {
        List<Integer> people = new ArrayList<>();

        for (int i = 0; i <= legs / 2; i++) {
            if ((legs - 2 * i) % 4 == 0)
                people.add(i);
        }

        System.out.println("people = " + people);
        return people.stream().mapToInt(Integer::intValue).toArray();
    }
}
