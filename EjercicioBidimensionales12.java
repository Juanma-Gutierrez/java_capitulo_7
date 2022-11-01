/**
 * Exercise: Bidimensionales 12
 *
 * @version: 01/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el
 * mínimo y la media de los números que hay en esa diagonal.
 */

public class EjercicioBidimensionales12 {
    public static void main(String[] args) {
        // Var declarations
        int[][] numArray;
        int max;
        int min;
        int total;

        // Var init
        numArray = new int[9][9];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        total = 0;

        // Generation data
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numArray[i][j] = (int) (Math.random() * 401) + 500;
                if (j == 8 - i)
                    System.out.print("\u001B[31m" + numArray[i][j] + "\u001B[0m\t");
                else
                    System.out.print(numArray[i][j] + "\t");
            }
            System.out.println();
        }

        // Output results
        System.out.println();
        for (int i = 8; i >=0; i--) {
            System.out.print(numArray[i][8-i] + "\t");
            if (numArray[i][8-i] > max)
                max = numArray[i][8-i];
            if (numArray[i][8-i] < min)
                min = numArray[i][8-i];
            total += numArray[i][8-i];
        }
        System.out.println();
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.printf("Media: %.2f\n", ((float) total / 10));

    }
}
