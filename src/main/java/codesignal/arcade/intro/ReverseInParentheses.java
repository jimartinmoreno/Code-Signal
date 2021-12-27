package codesignal.arcade.intro;

public class ReverseInParentheses {

    /**
     * Itera de dentro hacia afuera
     *
     * @param inputString
     * @return
     */
    static String solution(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while (str.indexOf("(") != -1) {
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);

            // Reemplaza la cadena (xxx) con el reverso de la cadena sin los parentesis
            str.replace(start, end + 1, new StringBuilder(str.substring(start + 1, end)).reverse().toString());
        }
        return str.toString();
    }

    /**
     * Itera de dentro hacia afuera
     *
     * @param inputString
     * @return
     */
    static String solution2(String inputString) {
        int start = inputString.lastIndexOf("(");
        int end = inputString.indexOf(")", start);
        if (start == -1 || end == -1 || start > end)
            return inputString;
        return solution2(inputString.substring(0, start) + new StringBuilder(inputString.substring(start + 1, end)).reverse() + inputString.substring(end + 1));
    }


    public static void main(String[] args) {
        System.out.println("foobazrabblim == " + solution("foo(bar(baz))blim")); // Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
        var inputString = "foo(bar)baz(blim)";
        System.out.println("foorabbazmilb == " + solution(inputString));
    }

}
