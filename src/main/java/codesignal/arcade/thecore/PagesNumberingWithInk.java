package codesignal.arcade.thecore;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/code-arcade/labyrinth-of-nested-loops/pdw3izd7SpMTBJqSy
 */
public class PagesNumberingWithInk {
    static int solution(int current, int numberOfDigits) {
        int pages = 0, currentPage = current;
        for (int i = current; pages <= numberOfDigits; i++) {
            pages += String.valueOf(i).length();
            currentPage = i;
        }
        System.out.println("currentPage = " + currentPage);
        return currentPage - 1;
    }
}
