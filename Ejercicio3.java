/**
 * Exercise: 3
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en
 * orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;

        // Var init
        numArray = new int[10];

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numArray[i] = sc.nextInt();
        }

        // Output data
        for (int i = 9; i >= 0; i--)
            System.out.println("En la posición " + i + " está el número " + numArray[i]);

        sc.close();
    }
}
