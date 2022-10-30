/**
 * Exercise: 6
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
 * muestra el contenido del array.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int aux;

        // Var init
        numArray = new int[15];

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        for (int i = 0; i < 15; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numArray[i] = sc.nextInt();
        }

        // Process
        for (int i = 0; i <= 7; i++) {
            aux = numArray[i];
            numArray[i] = numArray[14 - i];
            numArray[14 - i] = aux;
        }

        // Output data
        for (int i = 0; i < 15; i++)
            System.out.print(numArray[i] + ", ");

        sc.close();
    }
}
