package codesignal.arcade.intro;

public class CommonCharacterCount {

    static int solution(String s1, String s2) {
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(String.valueOf(s1.charAt(i)))) {
                counter++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        var s1 = "xyzbac";
        var s2 = "abca";
        System.out.println("count: " + solution(s1, s2));
    }
}
