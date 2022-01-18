package codesignal.arcade.thecore;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codesignal.com/arcade/code-arcade/mirror-lake/fQpfgxiY6aGiGHLtv
 */
public class DifferentSquaresMatrix {
    static int solution(int[][] matrix) {
        Set<String> rectangularMatrix = new HashSet<>();

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                rectangularMatrix.add(new StringBuilder()
                        .append(matrix[i - 1][j - 1])
                        .append(matrix[i - 1][j])
                        .append(matrix[i][j - 1])
                        .append(matrix[i][j]).toString());
            }
        }
        System.out.println("rectangularMatrix = " + rectangularMatrix);
        return rectangularMatrix.size();
    }

    static int solution2(int[][] matrix) {
        HashSet s = new HashSet();
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                s.add(matrix[i][j] + "," + matrix[i][j + 1] + "," + matrix[i + 1][j] + "," + matrix[i + 1][j + 1]);
            }
        }
        return s.size();
    }
}
