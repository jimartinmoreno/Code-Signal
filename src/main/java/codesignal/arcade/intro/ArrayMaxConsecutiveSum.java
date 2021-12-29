package codesignal.arcade.intro;

/**
 * https://app.codesignal.com/arcade/intro/level-8/Rqvw3daffNE7sT7d5
 */
//{2, 3, 5, 1, 6}
public class ArrayMaxConsecutiveSum {
    static int solution(int[] inputArray, int k) {
        int maxSum = 0, tempSum = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            tempSum = inputArray[i];
            for (int j = i + 1; j < i + k; j++) {
                if (j >= inputArray.length)
                    break;
                tempSum += inputArray[j];
            }
            maxSum = Math.max(maxSum, tempSum);
        }
        System.out.println("maxSum = " + maxSum);
        return maxSum;
    }

    static int solution2(int[] inputArray, int k) {
        int s = 0, ma;
        for(int i = 0; i < k; i++) s += inputArray[i];
        ma = s;
        for(int i = k; i < inputArray.length; i++) {
            s += inputArray[i] - inputArray[i - k];
            ma = Math.max(ma, s);
        }
        return ma;
    }
}
