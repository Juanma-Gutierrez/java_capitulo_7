/**
 * Exercise: Bidimensionales 9
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe
 * tener 12 filas por 12 columnas y debe contener números generados al azar
 * entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
 * resultado, ambas con los números convenientemente alineados.
 */

public class EjercicioBidimensionales9 {
    public static void main(String[] args) {
        // Var declarations
        int[][] numArray;
        int[][] auxArray;

        // Var init
        numArray = new int[12][12];
        auxArray = new int[12][12];

        // Generate data
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                numArray[i][j] = (int) (Math.random() * 101);

        // Output data 1
        System.out.println("\nArray original:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++)
                System.out.printf("%5d", numArray[i][j]);
            System.out.println();
        }

        // Process
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++) {
                auxArray[j][11 - i] = numArray[i][j];
            }


        // Output data 1
        System.out.println("\nArray procesado:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++)
                System.out.printf("%5d", auxArray[i][j]);
            System.out.println();
        }
    }
}
