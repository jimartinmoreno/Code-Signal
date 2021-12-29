package codesignal.arcade.intro;

import java.util.Arrays;

/**
 *  https://app.codesignal.com/arcade/intro/level-8/Rqvw3daffNE7sT7d5
 */
public class BishopAndPawn {

    /**
     * Devuelve true si la diferencia entre las coordenadas x y las coordenadas y de ambas piezas coincide, puesto que estan
     * recorriendo diagonales.
     * @param bishop
     * @param pawn
     * @return
     */
    static boolean solution2(String bishop, String pawn) {
        System.out.println((Math.abs(bishop.charAt(0) - pawn.charAt(0))) + " == " + (Math.abs(bishop.charAt(1) - pawn.charAt(1))));
        return (Math.abs(bishop.charAt(0) - pawn.charAt(0))) == (Math.abs(bishop.charAt(1) - pawn.charAt(1)));
    }


    /**
     * En este enfoque recorremos las diagonales y comparamos valores
     * @param bishop
     * @param pawn
     * @return
     */
    static boolean solution(String bishop, String pawn) {
        String[] bishopAr = bishop.split("");
        String[] pawnAr = pawn.split("");
        int[] bishopPos = {bishop.charAt(0) - 96, Integer.valueOf(bishopAr[1])};
        int[] pawnPos = {pawn.charAt(0) - 96, Integer.valueOf(pawnAr[1])};
        System.out.println("bishopPos = " + Arrays.toString(bishopPos));
        System.out.println("pawnPos = " + Arrays.toString(pawnPos));

        int x = 0;
        int y = 0;

        // A -> F, 1 -> 8 :: Diagonal ascendente derecha
        for (x = bishopPos[0], y = bishopPos[1]; x <= 8 && y <= 8; x++, y++) {
            //System.out.println("DAD: " + x + ", " + y);
            if (pawnPos[0] == x && pawnPos[1] == y) {
                System.out.println("DAD, se come el peon en la posición = " + Arrays.toString(pawnPos));
                return true;
            }
        }

        // A -> F, 8 -> 1 :: Diagonal descendente derecha
        for (x = bishopPos[0], y = bishopPos[1]; y > 0 && x <= 8; y--, x++) {
            //System.out.println("DAD: " + (x) + ", " + (y));
            if (pawnPos[0] == x && pawnPos[1] == y) {
                System.out.println("DDD, se come el peon en la posición = " + Arrays.toString(pawnPos));
                return true;
            }
        }

        // F -> A, 1 -> 8 :: Diagonal ascendente izquierda
        for (x = bishopPos[0], y = bishopPos[1]; x > 0 && y <= 8; x--, y++) {
            //System.out.println(x + ", " + y);
            if (pawnPos[0] == x && pawnPos[1] == y) {
                System.out.println("DAI, se come el peon en la posición = " + Arrays.toString(pawnPos));
                return true;
            }
        }

        // F -> A, 8 -> 1 :: Diagonal descendente izquierda
        for (x = bishopPos[0], y = bishopPos[1]; x > 0 && y > 0; x--, y--) {
            //System.out.println(x + ", " + y);
            if (pawnPos[0] == x && pawnPos[1] == y) {
                System.out.println("DDI, se come el peon en la posición = " + Arrays.toString(pawnPos));
                return true;
            }
        }
        return false;
    }
}
