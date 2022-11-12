/**
 * Exercise: Bidimensionales 5
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 */

public class EjercicioBidimensionales5 {
    public static void main(String[] args) {
        // Var declarations
        int[][] numArray;
        int max[];
        int min[];

        // Var init
        numArray = new int[6][10];
        max = new int[3];
        min = new int[3];
        max[0] = Integer.MIN_VALUE;
        min[0] = Integer.MAX_VALUE;

        // Generate data
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 10; j++) {
                numArray[i][j] = (int) (Math.random() * 1001);
                if (numArray[i][j] > max[0]) {
                    max[0] = numArray[i][j];
                    max[1] = i;
                    max[2] = j;
                }
                if (numArray[i][j] < min[0]) {
                    min[0] = numArray[i][j];
                    min[1] = i;
                    min[2] = j;
                }
            }

        // Output data
        System.out.printf("\n%11s", "");
        for (int j = 0; j < 10; j++)
            System.out.printf("%10s", "Col." + j);
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.printf("%10s", "Fila " + i + ":");
            for (int j = 0; j < 10; j++)
                System.out.printf("%10d", numArray[i][j]);
            System.out.println();
        }
        System.out.println(
                "\nEl número mayor es el " + max[0] + " que está en la fila " + max[1] + " y la columna " + max[2]);
        System.out.println(
                "El número menor es el " + min[0] + " que está en la fila " + min[1] + " y la columna " + min[2]);
    }
}
