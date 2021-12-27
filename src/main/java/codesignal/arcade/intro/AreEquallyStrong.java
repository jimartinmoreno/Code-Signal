package codesignal.arcade.intro;

import java.util.stream.IntStream;

public class AreEquallyStrong {
    static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int[] yoursAsc = IntStream.of(yourRight, yourLeft).sorted().toArray();
        int[] friendsAsc = IntStream.of(friendsRight, friendsLeft).sorted().toArray();
        if (friendsAsc[0] == yoursAsc[0] && friendsAsc[1] == yoursAsc[1]) {
            return true;
        } else {
            return false;
        }
    }

    static boolean solution2(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return yourLeft == friendsLeft && yourRight == friendsRight || yourLeft == friendsRight && yourRight == friendsLeft;
    }

    static boolean solution3(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight) && Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight);
    }

    public static void main(String[] args) {
        System.out.println("true = " + solution(10, 15, 15, 10));
    }
}
