package codesignal.arcade.intro;

import java.util.Arrays;

/**
 * https://app.codesignal.com/arcade/intro/level-12/tQgasP8b62JBeirMS/solutions?solutionId=xvfNtiC3uconqcqix
 * https://www.geeksforgeeks.org/check-if-given-sudoku-solution-is-valid-or-not/
 *
 */
public class Sudoku {
    static boolean solution(int[][] grid) {
        int[] rowsSummary = new int[9];
        int[] colsSummary = new int[9];
        int[] sectorSummary = new int[9];

        for (int row = 0; row < 9; row++) { //Itera filas
            for (int col = 0; col < 9; col++) { //Itera columnas
                rowsSummary[row] += grid[row][col];
                colsSummary[col] += grid[row][col];
                sectorSummary[((row / 3) * 3) + (col / 3)] += grid[row][col];
            }
        }
        System.out.println("sectorSumary = " + Arrays.toString(sectorSummary));
        System.out.println("colsSumary = " + Arrays.toString(colsSummary));
        System.out.println("rowsSumary = " + Arrays.toString(rowsSummary));
        System.out.println("Number of distinct = " + Arrays.stream(grid).mapToInt(row -> (int) Arrays.stream(row).distinct().count()).sum());

        //return Arrays.stream(grid[0]).distinct().count() == 9 &&
        return Arrays.stream(grid).mapToInt(row -> (int) Arrays.stream(row).distinct().count()).sum() == 81 && // Valida que no se repita ningun numero en las filas fila
                Arrays.stream(rowsSummary).allMatch(x -> x == 45) &&
                Arrays.stream(colsSummary).allMatch(x -> x == 45) &&
                Arrays.stream(sectorSummary).allMatch(x -> x == 45);
    }

    public static void main(String[] args) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
               System.out.println("index = " + (((row / 3) * 3 + (col / 3))));
            }
        }

//        System.out.println("(1/3) = " + ((1 / 3) * 3));
//        System.out.println("(3/3) = " + ((3 / 3) * 3));
//        System.out.println("(6/3) = " + ((6 / 3) * 3));
//        System.out.println("(1/3) = " + (1/3));
//        System.out.println("(3/3) = " + (3/3));
//        System.out.println("(6/3) = " + (6/3));
    }
}
