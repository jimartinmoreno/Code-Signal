package codesignal.arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AddBorder {

    static String[] solution(String[] picture) {
        List<String> pictList = new ArrayList<>(picture.length + 2);
        String topFrame = IntStream.range(0, picture[0].length() + 2)
                .mapToObj(value -> "*")
                .reduce((s, s2) -> s + s2).orElse("");

        pictList.add(topFrame);
        pictList.addAll(Arrays.stream(picture).map(s -> "*" + s + "*").toList());
        pictList.add(topFrame);

        return pictList.toArray(new String[0]);
    }

    static String[] solution2(String[] picture) {
        String[] framedPicture = new String[picture.length + 2];

        for (int i = 0; i < picture.length; i++) {
            framedPicture[i + 1] = '*' + picture[i] + '*';
        }

        framedPicture[0] = framedPicture[picture.length + 1] =
                framedPicture[1].replaceAll(".", "*");
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



