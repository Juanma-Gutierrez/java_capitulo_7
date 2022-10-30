/**
 * Exercise: 11
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un
 * array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int[] primeArray;
        int[] notPrimeArray;
        boolean prime;
        int primeCounter;
        int notPrimeCounter;

        // Var init
        numArray = new int[10];
        primeArray = new int[10];
        notPrimeArray = new int[10];
        primeCounter = 0;
        notPrimeCounter = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        for (int i = 0; i < 10; i++) {
            // System.out.print("Introduce el número " + (i + 1) + ": ");
            // numArray[i] = sc.nextInt();
            numArray[i] = (int) (Math.random() * 100);
        }

        // Output 1
        System.out.println("\nArray inicial:");
        System.out.println("+----+----+----+----+----+----+----+----+----+----+");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        System.out.println("+----+----+----+----+----+----+----+----+----+----+");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%3d ", numArray[i]);
        }
        System.out.println("|");
        System.out.println("+----+----+----+----+----+----+----+----+----+----+");

        // Process
        // Separate primes and not primes
        for (int i = 0; i < 10; i++) {
            prime = true;
            if (numArray[i] == 1)
                prime = false;
            for (int j = 2; j <= numArray[i] / 2; j++) {
                if (numArray[i] % j == 0) {
                    prime = false;
                }
            }
            if (prime)
                primeArray[primeCounter++] = numArray[i];
            else
                notPrimeArray[notPrimeCounter++] = numArray[i];
        }
        // Join array
        // First: prime numbers
        for (int i = 0; i < primeCounter; i++)
            numArray[i] = primeArray[i];
        // Second: not prime numbers
        for (int i = primeCounter; i < 10; i++)
            numArray[i] = notPrimeArray[i - primeCounter];

        // Output 2
        System.out.println("\nArray procesado:");
        System.out.println("+----+----+----+----+----+----+----+----+----+----+");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        System.out.println("+----+----+----+----+----+----+----+----+----+----+");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%3d ", numArray[i]);
        }
        System.out.println("|");
        System.out.println("+----+----+----+----+----+----+----+----+----+----+");

        sc.close();
    }
}
