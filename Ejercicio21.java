/**
 * Exercise: 21
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array “cincuerizado”, según el siguiente criterio: si el número que hay en
 * una posición del array es múltiplo de 5, se deja igual, y si no, se cambia
 * por el siguiente múltiplo de 5 que exista a partir de él.
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int num;

        // Var init
        numArray = new int[15];

        // Generation data
        for (int i = 0; i < 15; i++)
            numArray[i] = (int) (Math.random() * 501);

        // Output data 1
        System.out.println("Array original:");
        for (int n : numArray)
            System.out.print(n + " ");

        // Process
        for (int i = 0; i < 15; i++) {
            if (numArray[i] % 5 != 0) {
                for (int j = numArray[i] + 1; j < numArray[i] + 5; j++)
                    if (j % 5 == 0)
                        numArray[i] = j;
            }
        }

        // Output data 2
        System.out.println("\n\nArray cincuerizado:");
        for (int n : numArray)
            System.out.print(n + " ");

    }
}
