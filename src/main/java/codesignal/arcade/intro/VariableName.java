package codesignal.arcade.intro;

public class VariableName {
    static boolean solution(String name) {
        return name.matches("([A-Za-z0-9_]+)") && !Character.isDigit(name.charAt(0));
    }

    static boolean solution2(String name) {
        return name.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }
}
