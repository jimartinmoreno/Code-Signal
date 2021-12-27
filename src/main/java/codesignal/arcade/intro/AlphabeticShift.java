package codesignal.arcade.intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AlphabeticShift {
    static String solution(String inputString) {
        List<String> alphabetList = Stream.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        ).toList();

        String result = Arrays.stream(inputString.split(""))
                .map(letter -> alphabetList.indexOf(letter) + 1)
                .map(index -> index > 25 ? alphabetList.get(0) : alphabetList.get(index))
                .reduce(String::concat).get();
        return result;
    }

    static String solution2(String inputString) {
        char a = 'a';
        //        inputString.chars().forEach(letter -> {
        //            System.out.println(letter  + ": " + (letter - 'a' + 1));
        //        });
        // a es 97, b es 98, ... z es 122
        return new String(
                inputString.chars()
                        .map(x -> (x - 'a' + 1) % 26 + 'a')
                        .toArray(), 0, inputString.length());
    }
}
