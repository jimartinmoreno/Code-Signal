package codesignal.arcade.intro;

public class CheckPalindrome {
    boolean solution(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        var reverseString = sb.reverse().toString();
        return inputString.equals(reverseString);
    }
}
