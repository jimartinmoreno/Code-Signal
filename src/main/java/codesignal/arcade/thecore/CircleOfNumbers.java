package codesignal.arcade.thecore;

public class CircleOfNumbers {

    static int solution(int n, int firstNumber) {
        return firstNumber + n / 2 == n ? 0 : firstNumber + n / 2 > n ? firstNumber - n + (n / 2) : firstNumber + n / 2;
    }

    static int solution2(int n, int firstNumber) {
        return (firstNumber + n/2) % n;
    }

    static int solution3(int n, int firstNumber) {
        int radius = n / 2;
        return (firstNumber < radius) ? firstNumber + radius : firstNumber - radius;
    }

}
