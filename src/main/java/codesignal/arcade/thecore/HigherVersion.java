package codesignal.arcade.thecore;

/**
 * https://app.codesignal.com/arcade/code-arcade/lab-of-transformations/vsKRjYKv4SCjzJc8r
 */
public class HigherVersion {
    static boolean solution(String ver1, String ver2) {
        String[] ver1Arr = ver1.split("\\.");
        String[] ver2Arr = ver2.split("\\.");
        var tmp = 0;
        for (int i = 0; i < ver1Arr.length; i++) {
            tmp = Integer.compare(Integer.parseInt(ver1Arr[i]), Integer.parseInt(ver2Arr[i]));
            if (tmp > 0)
                return true;
            else if (tmp < 0)
                return false;
        }
        return false;
    }

    static boolean solution2(String ver1, String ver2) {
        String[] a = ver1.split("\\.");
        String[] b = ver2.split("\\.");
        for (int i = 0; i < a.length; i++) {
            int x = Integer.parseInt(a[i]);
            int y = Integer.parseInt(b[i]);
            if (x == y)
                continue;
            return x > y;
        }
        return false;
    }
}
