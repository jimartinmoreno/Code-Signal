package codesignal.arcade.intro;

public class IsDigit {
    static boolean solution(char symbol) {
        System.out.println("symbol = " + symbol);
        if (symbol >= 48 && symbol <= 57)
            return true;
        return false;
    }

}
