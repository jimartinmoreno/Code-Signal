package codesignal.interview.arrays;

public class RotateImage {
    static int[][] solution(int[][] a) {
        int[][] rotated90DegreesMatrix = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) { // filas
            int column = (a.length - 1) - i;
            for (int j = 0; j < a[i].length; j++) { // columnas
                int row = j;
                rotated90DegreesMatrix[row][column] = a[i][j];
            }
        }
        return rotated90DegreesMatrix;
    }

    static int[][] solution2(int[][] a) {
        int[][] ans = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                ans[i][j] = a[Math.abs(j - a.length + 1)][i];
            }
        }
        return ans;
    }
}
