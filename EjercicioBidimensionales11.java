/**
 * Exercise: Bidimensionales 11
 *
 * @version: 01/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el
 * mínimo y la media de los números que hay en esa diagonal.
 */

public class EjercicioBidimensionales11 {
    public static void main(String[] args) {
        // Var declarations
        int[][] numArray;
        int max;
        int min;
        int total;

        // Var init
        numArray = new int[10][10];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        total = 0;

        // Generation data
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                numArray[i][j] = (int) (Math.random() * 101) + 200;
                if (i == j)
                    System.out.print("\u001B[31m" + numArray[i][j] + "\u001B[0m\t");
                else
                    System.out.print(numArray[i][j] + "\t");
            }
            System.out.println();
        }

        // Output results
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(numArray[i][i] + "\t");
            if (numArray[i][i] > max)
            max = numArray[i][i];
            if (numArray[i][i] < min)
            min = numArray[i][i];
            total += numArray[i][i];
        }
        System.out.println();
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.printf("Media: %.2f\n", ((float) total / 10));
    }
}
