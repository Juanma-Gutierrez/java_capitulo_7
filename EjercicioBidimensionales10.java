/**
 * Exercise: Bidimensionales 10
 *
 * @version: 01/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza el juego de las tres en raya.
 */

/*
 * public static final String ANSI_RESET = "\u001B[0m";
 * public static final String ANSI_BLACK = "\u001B[30m";
 * public static final String ANSI_RED = "\u001B[31m";
 * public static final String ANSI_GREEN = "\u001B[32m";
 * public static final String ANSI_YELLOW = "\u001B[33m";
 * public static final String ANSI_BLUE = "\u001B[34m";
 * public static final String ANSI_PURPLE = "\u001B[35m";
 * public static final String ANSI_CYAN = "\u001B[36m";
 * public static final String ANSI_WHITE = "\u001B[35m";
 */

import java.util.Scanner;

public class EjercicioBidimensionales10 {

    public static void printBoard(String[] gameBoard) {

        System.out.println("┌───┬───┬───┐\t┌───┬───┬───┐");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("│ " + (i + 1) + " │ " + (i + 2) + " │ " + (i + 3) + " │\t│ " + gameBoard[i] + " │ "
                    + gameBoard[i + 1] + " │ " + gameBoard[i + 2] + " │ ");
            if (i != 6)
                System.out.println("├───┼───┼───┤\t├───┼───┼───┤");
        }
        System.out.println("└───┴───┴───┘\t└───┴───┴───┘");
    }

    public static void main(String[] args) {
        // Var declarations
        String[] gameBoard;
        int move;
        boolean validMove;
        boolean endGame;
        String winner;
        String playerSymbol;
        String cpuSymbol;
        int moveCounter;

        // Var init
        playerSymbol = "\u001B[31mX\u001B[0m";
        cpuSymbol = "\u001B[33mO\u001B[0m";
        winner = "";
        gameBoard = new String[9];
        endGame = false;
        moveCounter = 0;
        for (int i = 0; i < 9; i++)
            gameBoard[i] = " ";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Print game board
        System.out.println("JUEGO DEL TRES EN RAYA");
        System.out.println("----------------------");
        System.out.println("Verás tu jugada con el símbolo 'O' y la del ordenador con 'X'");

        while (!endGame && moveCounter != 9) {

            validMove = false;
            // Player move
            do {
                printBoard(gameBoard);
                System.out.print("Selecciona tu movimiento (1-9): ");
                move = sc.nextInt();
                if (gameBoard[move - 1].equals(" ")) {
                    gameBoard[move - 1] = playerSymbol;
                    validMove = true;
                    moveCounter++;
                } else {
                    System.out.println("\033[91mIntroduce un movimiento válido, por favor\033[39;49m");
                }
            } while (!validMove && moveCounter != 9);

            // Check player win
            // Check horizontals
            for (int i = 0; i < 9; i += 3)
                if (gameBoard[i].equals(playerSymbol) && gameBoard[i + 1].equals(playerSymbol)
                        && gameBoard[i + 2].equals(playerSymbol)) {
                    winner = "player";
                    endGame = true;
                }
            // Check verticals
            for (int j = 0; j < 3; j++)
                if (gameBoard[j].equals(playerSymbol) && gameBoard[j + 3].equals(playerSymbol)
                        && gameBoard[j + 6].equals(playerSymbol)) {
                    winner = "player";
                    endGame = true;
                }
            // Check diagonals
            if ((gameBoard[0].equals(playerSymbol) && gameBoard[4].equals(playerSymbol)
                    && gameBoard[8].equals(playerSymbol)) ||
                    (gameBoard[2].equals(playerSymbol) && gameBoard[4].equals(playerSymbol)
                            && gameBoard[6].equals(playerSymbol))) {
                winner = "player";
                endGame = true;
            }

            // CPU move
            if (!endGame) {
                validMove = false;
                do {
                    move = (int) (Math.random() * 9) + 1;
                    if (gameBoard[move - 1].equals(" ")) {
                        gameBoard[move - 1] = cpuSymbol;
                        validMove = true;
                        moveCounter++;
                    }
                } while (!validMove && moveCounter < 9);
            }

            // Check cpu win
            // Check horizontals
            for (int i = 0; i < 9; i += 3)
                if (gameBoard[i].equals(cpuSymbol) && gameBoard[i + 1].equals(cpuSymbol)
                        && gameBoard[i + 2].equals(cpuSymbol)) {
                    winner = "cpu";
                    endGame = true;
                }
            // Check verticals
            for (int j = 0; j < 3; j++)
                if (gameBoard[j].equals(cpuSymbol) && gameBoard[j + 3].equals(cpuSymbol)
                        && gameBoard[j + 6].equals(cpuSymbol)) {
                    winner = "cpu";
                    endGame = true;
                }
            // Check diagonals
            if ((gameBoard[0].equals(cpuSymbol) && gameBoard[4].equals(cpuSymbol)
                    && gameBoard[8].equals(cpuSymbol)) ||
                    (gameBoard[2].equals(cpuSymbol) && gameBoard[4].equals(cpuSymbol)
                            && gameBoard[6].equals(cpuSymbol))) {
                winner = "cpu";
                endGame = true;
            }

            // si es tres en raya imprimir y finalizar
            if (winner != "")
                printBoard(gameBoard);
        }

        if (winner.equals("player")) {
            System.out.println("¡¡ Has ganado !!\n");

        } else if (winner.equals("cpu"))
            System.out.println("Lo siento, has perdido\n");
        else {
            printBoard(gameBoard);
            System.out.println("Ha habido empate, no hay más movimientos\n");
        }

        // Scanner close
        sc.close();
    }

}
