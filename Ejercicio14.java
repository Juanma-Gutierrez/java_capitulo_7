/**
 * Exercise: 14
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos
 * arrays auxiliares como quieras. Los colores que conoce el programa deben
 * estar en otro array y son los siguientes: verde, rojo, azul, amarillo,
 * naranja, rosa, negro, blanco y morado.
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Var declarations
        String[] colorArray = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
        String[] wordArray;
        String[] auxArray;
        int count;
        boolean isColor;

        // Var init
        wordArray = new String[8];
        auxArray = new String[8];
        count = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce la  palabra nº " + (i + 1) + ": ");
            wordArray[i] = sc.next();
        }

        // Output data 2
        System.out.println("\nArray original:");
        System.out.println("┌──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.printf("│ %8d ", i);
        }
        System.out.println(
                "|\n├──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        for (String w : wordArray) {
            System.out.printf("│ %8s ", w);
        }
        System.out.println(
                "|\n└──────────┴──────────┴──────────┴──────────┴──────────┴──────────┴──────────┴──────────┘");

        // Process
        auxArray = wordArray.clone();

        // Insert colors
        for (String a : auxArray) {
            for (String c : colorArray) {
                if (a.equals(c))
                    wordArray[count++] = a;
            }
        }

        // Insert not colors
        for (int i = 0; i < 8; i++) {
            isColor = false;
            for (String c : colorArray) {
                if (auxArray[i].equals(c))
                    isColor = true;
            }
            if (!isColor) {
                wordArray[count] = auxArray[i];
                count++;
            }
        }

        // Output data 2
        System.out.println("\nArray procesado:");
        System.out.println("┌──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.printf("│ %8d ", i);
        }
        System.out.println(
                "|\n├──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        for (String w : wordArray) {
            System.out.printf("│ %8s ", w);
        }
        System.out.println(
                "|\n└──────────┴──────────┴──────────┴──────────┴──────────┴──────────┴──────────┴──────────┘");

        sc.close();
    }
}
