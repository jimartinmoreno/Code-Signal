package codesignal.arcade;

import java.util.Arrays;

public class ArrayReplace {
    static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray).map(operand -> operand == elemToReplace?substitutionElem:operand).toArray();
    }
}
