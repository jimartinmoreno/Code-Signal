package codesignal.arcade.intro;

/**
 * https://app.codesignal.com/arcade/intro/level-12/NJJhENpgheFRQbPRA
 */
public class DigitsProduct {

    static int solution(int product) {
        System.out.println("product = " + product);
        if (product == 0)
            return 10;
        if (product < 10)
            return product;

        for (int num = 1; num < (product * product); num++) {
            int multiply = String.valueOf(num).chars()
                    .map(Character::getNumericValue)
                    .reduce(1, Math::multiplyExact);
            if (multiply == product) {
                System.out.println("multiply = " + multiply);
                return num;
            }
        }
        return -1;
    }

    static int solution2(int product) {
        if (product == 0)
            return 10;
        if (product < 10)
            return product;

        String temp = "";
        for (int digit = 9; digit > 1; digit--)
            for (; product % digit == 0; product /= digit)
                temp = digit + temp;
        return product == 1 ? Integer.parseInt(temp) : -1;
    }

}
