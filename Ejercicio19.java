/**
 * Exercise: 19
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición
 * 11) siempre se perderá.
 */

import java.util.Scanner;

public class Ejercicio19 {

    public static void printTable(int[] numArray) {
        // Output data
        System.out.println(
                "┌──────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("| Índice:  ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("│  %2d ", i);
        }
        System.out.println(
                "|\n├──────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| Valor:   ");

        for (int n : numArray) {
            System.out.printf("│ %3d ", n);
        }
        System.out.println(
                "|\n└──────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }

    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int[] auxArray;
        int num;
        int pos;

        // Var init
        numArray = new int[12];
        auxArray = new int[12];

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Generation data
        for (int i = 0; i < 12; i++)
            numArray[i] = (int) (Math.random() * 201);
        auxArray = numArray.clone();

        // Output data 1
        System.out.println("\nArray original:");
        printTable(numArray);

        // Input data
        System.out.print("Introduzca el número que quiere insertar: ");
        num = sc.nextInt();
        System.out.print("Introduzca la posición donde lo quiere insertar (0-11): ");
        pos = sc.nextInt();

        // Process
        for (int i = 0; i < 12; i++) {
            if (i < pos) {
                numArray[i] = auxArray[i];
            } else {
                if (i == pos)
                    numArray[i] = num;
                else
                    numArray[i] = auxArray[i - 1];
            }
        }
        
        System.out.println("\nArray procesado:");
        printTable(numArray);

        sc.close();
    }
}
