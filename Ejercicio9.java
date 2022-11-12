/**
 * Exercise: 9
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;

        // Var init
        numArray = new int[8];

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numArray[i] = sc.nextInt();
        }

        // Output data
        for (int n : numArray) {
            System.out.print(n);
            if (n % 2 == 0)
                System.out.println(" - Par");
            else
                System.out.println(" - Impar");
        }

        // Close scanner
        sc.close();
    }
}
