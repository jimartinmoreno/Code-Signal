package codesignal.arcade.intro;

public class ChessBoardCellColor {

    static boolean solution(String cell1, String cell2) {
        //A es 65, B es 66, ... Z es 91
        return (cell1.charAt(0) + cell1.charAt(1) + cell2.charAt(0) + cell2.charAt(1)) % 2 == 0;
    }

    static boolean solution2(String cell1, String cell2) {
        //A es 65, B es 66, ... Z es 91
        return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;
    }
}
