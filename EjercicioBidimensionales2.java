/**
 * Exercise: Bidimensionales 2
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 */

import java.util.Scanner;

public class EjercicioBidimensionales2 {
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

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.println("Introduce los 20 números de la tabla y pulsa INTRO para almacenarlos");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numArray[i][j] = sc.nextInt();
                rowTotal[i] += numArray[i][j];
                columnTotal[j] += numArray[i][j];
                total += numArray[i][j];
            }
        }

        // Output data
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("| %7d ", numArray[i][j]);
            }
            System.out.printf("|\033[91m %7d \033[39;49m|\n", rowTotal[i]);
        }
        for (int j = 0; j < 5; j++) {
            System.out.printf("|\033[91m %7d \033[39;49m", columnTotal[j]);
        }
        System.out.printf("|\033[91m %7d \033[39;49m|\n", total);

        sc.close();
    }
}
