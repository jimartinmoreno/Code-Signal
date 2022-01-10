package codesignal.arcade.intro;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codesignal.com/arcade/intro/level-12/fQpfgxiY6aGiGHLtv/solutions?solutionId=ngoz8gdoBs38KFwZj
 */
public class DifferentSquares {
    static int solution(int[][] matrix) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                String temp = "[" + matrix[i][j] + ":" +
                        matrix[i + 1][j] + ":" +
                        matrix[i][j + 1] + ":" +
                        matrix[i + 1][j + 1] + "]";
                set.add(temp);
            }
        }
        System.out.println("set = " + set);
        return set.size();
    }
}
