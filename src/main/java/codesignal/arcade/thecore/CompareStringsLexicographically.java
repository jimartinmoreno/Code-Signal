package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/book-market/Ky2mjgmxnWLi6KNPp
 */
public class CompareStringsLexicographically {
    static boolean solution(String filename1, String filename2) {
        System.out.println("filename1.compareTo(filename2) = " + filename1.compareTo(filename2));
        System.out.println("(filename1.toLowerCase()).compareTo(filename2.toLowerCase())) = " + (filename1.toLowerCase()).compareTo(filename2.toLowerCase()));
        return (filename1.compareTo(filename2) *
                ((filename1.toLowerCase()).compareTo(filename2.toLowerCase())) < 0);
    }
}
