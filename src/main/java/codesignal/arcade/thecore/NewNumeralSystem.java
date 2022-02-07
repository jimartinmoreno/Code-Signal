package codesignal.arcade.thecore;

import java.util.stream.IntStream;

public class NewNumeralSystem {

    static String[] solution(char number) {
        int n = number - 'A';
        String[] solution = new String[n / 2 + 1];
        solution[0] = "A + " + Character.toString(n + 65);

        for (int i = 1; i < n / 2 + 1; i++) {
            solution[i] = Character.toString(i + 'A') + " + " + Character.toString((n - i) + 'A');
        }
        return solution;
    }

    static String[] solution2(char number) {
        return IntStream.rangeClosed(0, (number - 'A') / 2)
                .mapToObj(x -> String.format("%c + %c", 'A' + x, number - x))
                .toArray(String[]::new);
    }
}
