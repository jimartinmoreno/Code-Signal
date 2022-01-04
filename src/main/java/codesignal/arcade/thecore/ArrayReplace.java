package codesignal.arcade.thecore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://app.codesignal.com/arcade/code-arcade/list-forest-edge/mCkmbxdMsMTjBc3Bm/solutions
 */
public class ArrayReplace {

    static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray)
                .map(operand -> operand == elemToReplace ? substitutionElem : operand)
                .toArray();
    }

    static List solution2(List<Integer> i, Integer elemToReplace, Integer substitutionElem) {
        Collections.replaceAll(i, elemToReplace, substitutionElem);
        return i;
    }
}
