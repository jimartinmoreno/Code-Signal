package codesignal.arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AddBorder {

    static String[] solution(String[] picture) {
        var arrayLength = picture.length;
        var elementsLength = picture[0].length();

        List<String> pictList = new ArrayList<>(arrayLength + 2);
        String result = IntStream.range(0, elementsLength + 2).mapToObj(value -> "*").reduce((s, s2) -> s + s2).get();
        pictList.add(result);

        pictList.addAll(Arrays.stream(picture)
                .map(s -> new StringBuilder("*").append(s).append("*").toString()).toList()
        );
        pictList.add(result);

        return pictList.toArray(new String[0]);
    }

    static String[] solution2(String[] picture) {
        String[] framedPicture = new String[picture.length + 2];

        for(int i = 0 ; i < picture.length ; i++) {
            framedPicture[i+1] = '*' + picture[i] + '*';
        }

        framedPicture[0] = framedPicture[picture.length + 1] = framedPicture[1].replaceAll(".","*");
        return framedPicture;
    }


    /**
     * For
     * <p>
     * picture = ["abc",
     * "ded"]
     * <p>
     * the output should be
     * <p>
     * solution(picture) = ["*****",
     * "*abc*",
     * "*ded*",
     * "*****"]
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] picture = {"abc", "ded"};
        System.out.println("picture = " + solution(picture));
    }
}



