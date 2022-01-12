package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/book-market/2SDWWyHY9Xw5CpphY
 */
public class IsTandemRepeat {
    static boolean solution(String inputString) {
        System.out.println("inputString = " + inputString);

        StringBuilder sbReverse = new StringBuilder();
        String pattern = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            sbReverse.insert(0, inputString.charAt(i));
            if (sbReverse.length() != inputString.length()
                    && inputString.indexOf(sbReverse.toString()) == 0
                    && inputString.lastIndexOf(pattern) > 1
                    && sbReverse.length() * 2 == inputString.length()) {
                pattern = sbReverse.toString();

                break;
            }
        }
        System.out.println("pattern = " + pattern);
        return pattern.length() != 0;
    }

    static boolean solution2(String inputString) {
        int mid = inputString.length()/2;
        return (inputString.substring(0,mid)).equals(inputString.substring(mid));
    }

    static boolean solution3(String inputString) {
        return inputString.matches("(\\w+)\\1");
    }


}
