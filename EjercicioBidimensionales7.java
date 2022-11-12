/**
 * Exercise: Bidimensionales 7
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 */

import java.util.Scanner;

public class EjercicioBidimensionales7 {
    public static void main(String[] args) {
        // Var declarations
        String[][] map;
        int moveTry;
        String mine;
        String treasure;
        String empty;
        int mineX;
        int mineY;
        int treasureX;
        int treasureY;
        int rowTry;
        int colTry;
        boolean endGame;

        // Var init
        map = new String[5][4];
        moveTry = 6;
        empty = "░";
        mine = "\033[91m@\033[39;49m";
        treasure = "\033[0;33mT\033[0m";
        endGame = false;
        rowTry = 0;
        colTry = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Create map
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 4; j++)
                map[i][j] = empty;

        // Put items
        mineX = (int) (Math.random() * 4);
        mineY = (int) (Math.random() * 3);
        map[mineX][mineY] = mine;
        do {
            treasureX = (int) (Math.random() * 4);
            treasureY = (int) (Math.random() * 3);
        } while (mineX == treasureX && mineY == treasureY);
        map[treasureX][treasureY] = treasure;

        // Print instructions
        System.out.println("\nBienvenido al juego del tesoro");
        System.out.println("\nDebes localizar el tesoro sin que te explote la mina");
        System.out.println("");

        // Print map
        System.out.println("Tienes " + moveTry + " intentos");
        System.out.println("\n  0123");
        System.out.println("------");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < 4; j++)
                if (map[i][j] == "X" || endGame)
                    System.out.print(map[i][j]);
                else
                    System.out.print(" ");
            System.out.println();
        }

        // Process
        while (!endGame) {
            // Input data
            System.out.print("Indique la fila: ");
            rowTry = sc.nextInt();
            System.out.print("Indique la columna: ");
            colTry = sc.nextInt();
            moveTry--;
            if (moveTry == 0)
                endGame = true;

            // Check try
            if (map[rowTry][colTry] == "░")
                map[rowTry][colTry] = "X";

            // Find item
            if ((map[rowTry][colTry] == "\033[91m@\033[39;49m") || (map[rowTry][colTry] == "\033[0;33mT\033[0m"))
                endGame = true;

            // Near mine
            if ((Math.abs(rowTry - mineX) == 1 && Math.abs(colTry - mineY) <= 1)
                    || (Math.abs(colTry - mineY) == 1) && Math.abs(rowTry - mineX) <= 1)
                System.out.println("\033[91m\n\n¡¡CUIDADO!! Estás muy cerca de la mina\033[39;49m");

            // Print map
            System.out.println("\n\nTienes " + moveTry + " intentos");
            System.out.println("\n  0123");
            System.out.println("------");
            for (int i = 0; i < 5; i++) {
                System.out.print(i + "|");
                for (int j = 0; j < 4; j++) {
                    if (map[i][j] == "X" || endGame)
                        System.out.print(map[i][j]);
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        if (map[rowTry][colTry] == "\033[0;33mT\033[0m")
            System.out.println("\n¡Enhorabuena, has conseguido encontrar el tesoro!");
        if (map[rowTry][colTry] == "\033[91m@\033[39;49m")
            System.out.println("\nMala suerte, te ha explotado la mina");
        if (moveTry == 0)
            System.out.println("\nLo siento, te has quedado sin movimientos");

        // Close scanner
        sc.close();
    }
}