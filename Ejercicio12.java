/**
 * Exercise: 12
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un
 * array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de la
 * posición inicial en la posición final, rotando el resto de números para que
 * no se pierda ninguno. Al final se debe mostrar el array resultante.Realiza un
 * programa que pida 10 números por teclado y que los almacene en un array. A
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9).
 * Seguidamente el programa pedirá dos posiciones a las que llamaremos “inicial”
 * y “final”. Se debe comprobar que inicial es menor que final y que ambos
 * números están entre 0 y 9. El programa deberá colocar el número de la
 * posición inicial en la posición final, rotando el resto de números para que
 * no se pierda ninguno. Al final se debe mostrar el array resultante.
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int[] auxArray;
        int start;
        int end;

        // Var init
        numArray = new int[10];
        auxArray = new int[10];

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número de la posición " + i + ": ");
            numArray[i] = sc.nextInt();
        }
        do {
            System.out.print("Introduce la posición inicial (0-9): ");
            start = sc.nextInt();
            System.out.print("Introduce la posición final (0-9): ");
            end = sc.nextInt();
        } while (end <= start);

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
        // Clone array
        auxArray = numArray.clone();
        // Right side
        numArray[end] = auxArray[start];
        end++;
        do {
            numArray[end] = auxArray[end - 1];
            end++;
        } while (end < 10);
        // Left side
        numArray[0] = auxArray[9];
        end = 1;
        do {
            numArray[end] = auxArray[end - 1];
            end++;
        } while (end <= start);

        // Output 2
        System.out.println("\nArray final:");
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
