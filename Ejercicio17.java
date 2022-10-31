/**
 * Exercise: 17
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/* Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca
 * uno correctamente. A continuación, el programa rotará el array hacia la
 * derecha las veces que haga falta hasta que el número introducido quede
 * situado en la posición 0 del array. Por último, se mostrará el array rotado
 * por pantalla.
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int[] auxArray;
        int pos;
        int num;
        boolean inside;

        // Var init
        numArray = new int[10];
        inside = false;

        // Generation data
        for (int i = 0; i < 10; i++)
            numArray[i] = (int) (Math.random() * 101);
        auxArray = numArray.clone();

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        do {
            // Output data
            System.out.println("Array original: ");
            for (int n : numArray)
                System.out.print(n + " ");
            System.out.print("\n\nIntroduce un número de los que aparecen en la lista: ");
            num = sc.nextInt();

            // Check number
            pos = 0;
            for (int i = 0; i < 10 && !inside; i++) {
                if (num == numArray[i])
                    inside = true;
                else
                    pos++;
            }
            if (!inside)
                System.out.println("\n\n\033[91mPor favor, introduce un número correcto\033[39;49m");
        } while (!inside);

        // Process
        // First numbers
        for (int i = 0; i < 10 - pos; i++)
            numArray[i] = auxArray[pos + i];
        // Last numbers
        num = 0;
        for (int i = 10 - pos; i < 10; i++)
            numArray[i] = auxArray[num++];

        // Output data
        System.out.println("Array rotado: ");
        for (int n : numArray)
            System.out.print(n + " ");

        sc.close();
    }
}
