/**
 * Exercise: 16
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array
 * escribiendo los números que se quieren resaltar entre corchetes.
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int resp;

        // Var init
        numArray = new int[20];
        resp = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Generation data
        for (int i = 0; i < 20; i++) {
            numArray[i] = (int) (Math.random() * 401);
        }

        // Output data 1
        do {

            for (int n : numArray)
                switch (resp) {
                    case 1:
                        if (n % 5 == 0)
                            System.out.print("\033[91m#" + n + "#\033[39;49m ");
                        else
                            System.out.print(n + " ");
                        break;
                    case 2:
                        if (n % 7 == 0)
                            System.out.print("\033[91m#" + n + "#\033[39;49m ");
                        else
                            System.out.print(n + " ");
                        break;
                    default:
                        System.out.print(n + " ");
                }

            // Input data
            System.out.println("\n\n¿Qué deseas hacer?");
            System.out.println("1: Resaltar múltiplos de 5");
            System.out.println("2: Resaltar múltiplos de 7");
            System.out.println("3: Salir");
            resp = sc.nextInt();
        } while (resp != 3);

        // Scanner close
        sc.close();
    }
}
