package codesignal.arcade.thecore;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/code-arcade/book-market/MX94DWTrwQw2gLrTi
 */
public class HTMLEndTagByStartTag {
    static String solution(String startTag) {
        System.out.println("startTag.split(\" \") = " + Arrays.toString(startTag.split(" ")));
        if (startTag.split(" ").length > 1)
            return "</".concat(startTag.split(" ")[0].substring(1).concat(">"));
        else
            return "</".concat(startTag.substring(1));
    }

    static String solution2(String startTag) {
        System.out.println("startTag.split(\"[< >]\") = " + Arrays.toString(startTag.split("[< >]")));
        return "</".concat(startTag.split("[< >]")[1]).concat(">");
    }
}
