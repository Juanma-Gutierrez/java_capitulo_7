/**
 * Exercise: 5
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int max;
        int min;

        // Var init
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        numArray = new int[10];

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numArray[i] = sc.nextInt();
            if (numArray[i] > max)
                max = numArray[i];
            if (numArray[i] < min)
                min = numArray[i];
        }

        // Output data
        for (int i = 0; i < 10; i++) {
            System.out.print("En la posición " + i + " del array: " + numArray[i]);
            if (numArray[i] == max)
                System.out.print(" - Máximo");
            if (numArray[i] == min)
                System.out.print(" - Mínimo");
            System.out.println();
        }

        // Close scanner
        sc.close();
    }
}
