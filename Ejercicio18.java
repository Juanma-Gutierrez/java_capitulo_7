/**
 * Exercise: 18
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente
 * el programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 */

public class Ejercicio18 {
    public static void printTable(int[] numArray) {
        // Output data
        System.out.println(
                "┌──────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("| Índice:  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│  %2d ", (i + 1));
        }
        System.out.println(
                "|\n├──────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| Valor:   ");

        for (int n : numArray) {
            System.out.printf("│ %3d ", n);
        }
        System.out.println(
                "|\n└──────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }

    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int[] lowerArray;
        int[] higherArray;
        int lowerCounter;
        int higherCounter;
        int lowerTotal;
        int higherTotal;
        int counter;

        // Var init
        numArray = new int[10];
        lowerArray = new int[10];
        higherArray = new int[10];
        lowerCounter = 0;
        higherCounter = 0;
        lowerTotal = 0;
        higherTotal = 0;
        counter = 0;

        // Generation data
        for (int i = 0; i < 10; i++) {
            numArray[i] = (int) (Math.random() * 201);
            if (numArray[i] < 100)
                lowerArray[lowerTotal++] = numArray[i];
            else
                higherArray[higherTotal++] = numArray[i];
        }

        // Output data 1
        System.out.println("\nArray original:");
        printTable(numArray);

        // Process data
        do {
            if (lowerCounter < lowerTotal)
                numArray[counter++] = lowerArray[lowerCounter++];
            if (higherCounter < higherTotal)
                numArray[counter++] = higherArray[higherCounter++];
        } while (counter < 10);

        // Output data 2
        System.out.println("\nArray procesado:");
        printTable(numArray);
    }

}
