package codesignal.arcade;

import java.util.stream.IntStream;

public class MatrixElementsSum {
    static int solution(int[][] matrix) {
        int sum = IntStream.range(0, matrix.length)
                .map(i ->
                        IntStream.range(0, matrix[i].length)
                                .map(j -> {
                                    if (i != 0) {
                                        for (int k = 0; k < i; k++) {
                                            if (matrix[k][j] == 0) {
                                                return 0;
                                            }
                                        }
                                    }
                                    return matrix[i][j];
                                }).sum()
                ).sum();
        System.out.println("sum = " + sum);

        //        List<Integer> listOfInts = Arrays.stream(Arrays.stream(matrix)
        //                .flatMapToInt(x -> Arrays.stream(x))
        //                .filter(value -> value != 0).toArray()).boxed().toList();
        //
        //        System.out.println("listOfInts = " + listOfInts);
        //
        //        int sum = Arrays.stream(matrix)
        //                .flatMapToInt(x -> Arrays.stream(x))
        //                .filter(value -> value != 0).reduce(0, Integer::sum);
        //
        //        System.out.println("sum = " + sum);

        return sum;
    }

    /**
     * Itera sobre las columnas bajando por las filas y va sumando hasta que encuentra un 0
     *
     * @param matrix
     * @return
     */
    static int solution2(int[][] matrix) {
        int s = 0;
        for (int c = 0; c < matrix[0].length; ++c)
            for (int r = 0; r < matrix.length; ++r) {
                System.out.println("[" + r + ", " + c + "] = " + matrix[r][c]);
                if (matrix[r][c] > 0)
                    s += matrix[r][c];
                else break;
            }
        System.out.println("sum = " + s);
        return s;
    }

    public static void main(String[] args) {
        //int[][] matrix = new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
//        solution2(new int[][]{{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}}); // 9
        solution2(new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}}); // 9
//        solution(new int[][]{{0, 1, 1}, {0, 5, 0}, {2, 0, 3}}); // 7
//        solution(new int[][]{{0, 0, 1}, {0, 5, 1}, {2, 0, 3}}); // 5
//        solution(new int[][]{{0, 1}, {0, 5}, {2, 0}}); // 6
//        solution(new int[][]{{0}, {0}, {2}}); // 0
//        solution(new int[][]{{0}}); // 0
    }
}


