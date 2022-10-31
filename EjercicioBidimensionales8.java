/**
 * Exercise: Bidimensionales 8
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como
 * se indica en la figura, el alfil se mueve siempre en diagonal. El tablero
 * cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la
 * “h” y las filas se indican del 1 al 8.
 */

import java.util.Scanner;

public class EjercicioBidimensionales8 {
    public static void main(String[] args) {
        // Var declarations
        String[][] bishop;
        String moveTry;
        int row;
        int col;

        // Var init
        bishop = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                bishop[i][j] = " ";
            }
        }

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la posición del alfil (a-h/1-8), p.ej.d3: ");
        moveTry = sc.next();
        row = moveTry.charAt(1) - 48 - 1;
        col = moveTry.charAt(0) - 96 - 1;

        System.out.println(row + " " + col);

        // Process
        // Fill movements
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Math.abs(row - i) == Math.abs(col - j))
                    bishop[i][j] = "o";
            }
        }
        // Fill bishop
        bishop[row][col] = "@";

        // Output data
        System.out.println("\n  abcdefgh");
        System.out.println(" +--------+");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < 8; j++) {
                System.out.print(bishop[i][j]);
            }
            System.out.println("|" + (i + 1));
        }
        System.out.println(" +--------+");
        System.out.println("  abcdefgh\n");

        sc.close();
    }
}
