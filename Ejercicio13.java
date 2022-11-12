/**
 * Exercise: 13
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que rellene un array de 100 elementos con números enteros
 * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el
 * número destacado entre dobles asteriscos.
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        // Var declarations
        int[] numArray;
        int highlight;
        int max;
        int min;

        // Var init
        numArray = new int[100];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Generate data
        for (int i = 0; i < 100; i++) {
            numArray[i] = (int) (Math.random() * 501);
            if (numArray[i] > max)
                max = numArray[i];
            if (numArray[i] < min)
                min = numArray[i];
        }

        // Output data 1
        for (int n : numArray)
            System.out.print(n + " ");

        // Input data
        do {
            System.out.println("\n\n¿Qué desea destacar (1 - máximo, 2 - mínimo): ");
            highlight = sc.nextInt();
        } while (highlight != 1 && highlight != 2);

        // Output data 2
        for (int n : numArray)
            if (highlight == 1)
                if (n == max)
                    System.out.print("**" + n + "** ");
                else
                    System.out.print(n + " ");
            else if (highlight == 2)
                if (n == min)
                    System.out.print("**" + n + "** ");
                else
                    System.out.print(n + " ");

        // Close scanner
        sc.close();
    }

}