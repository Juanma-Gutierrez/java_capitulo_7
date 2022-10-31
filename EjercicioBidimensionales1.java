/**
 * Exercise: Bidimensionales 1
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y
 * asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 */

public class EjercicioBidimensionales1 {
    public static void main(String[] args) {
        // Var declarations
        int[][] numArray;

        // Var init
        numArray = new int[3][6];
        numArray[0][0] = 0;
        numArray[0][1] = 30;
        numArray[0][2] = 2;
        numArray[0][5] = 5;
        numArray[1][0] = 75;
        numArray[1][4] = 0;
        numArray[2][2] = -2;
        numArray[2][3] = 9;
        numArray[2][5] = 11;

        // Output data
        System.out.print("| Array num ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-12s", "| Columna " + i);
        }
        System.out.println("|");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%-12s", "|-----------");
        }
        System.out.println("|");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-12s", "|  Fila " + i);
            for (int j = 0; j < 6; j++)
                System.out.printf("| %8d  ", numArray[i][j]);
            System.out.println("|");
        }

    }
}
