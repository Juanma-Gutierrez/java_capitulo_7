/**
 * Exercise: Bidimensionales 3
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 */

public class EjercicioBidimensionales3 {
    public static void main(String[] args) {
        // Var declaration
        int[][] numArray;
        int rowTotal[];
        int columnTotal[];
        int total;

        // Var init
        numArray = new int[4][5];
        rowTotal = new int[4];
        columnTotal = new int[5];
        total = 0;

        // Input data
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++) {
                numArray[i][j] = (int) (Math.random() * 900) + 100;
                rowTotal[i] += numArray[i][j];
                columnTotal[j] += numArray[i][j];
                total += numArray[i][j];
            }

        // Output data
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++)
                System.out.printf("| %7d ", numArray[i][j]);
            System.out.printf("|\033[91m %7d \033[39;49m|\n", rowTotal[i]);
        }
        for (int j = 0; j < 5; j++)
            System.out.printf("|\033[91m %7d \033[39;49m", columnTotal[j]);
        System.out.printf("|\033[91m %7d \033[39;49m|\n", total);
    }
}
