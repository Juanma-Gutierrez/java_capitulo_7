/**
 * Exercise: 7
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int num1;
        int num2;

        // Var init
        numArray = new int[100];

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data 1
        for (int i = 0; i < 100; i++) {
            numArray[i] = (int) (Math.random() * 21);
        }

        // Output data 1
        for (int n : numArray)
            System.out.print(n + ", ");

        // Input data 2
        System.out.print("\nIntroduce el primer número de los mostrados: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el número por el que quieres sustituirlo: ");
        num2 = sc.nextInt();

        // Process
        for (int i = 0; i < 100; i++) {
            if (numArray[i] == num1) {
                numArray[i] = num2;
                System.out.print("\"" + numArray[i] + "\", ");
            } else
                System.out.print(numArray[i] + ", ");
        }
        sc.close();
    }
}
