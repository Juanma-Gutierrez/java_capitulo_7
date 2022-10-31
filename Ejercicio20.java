/**
 * Exercise: 20
 *
 * @version: 31/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Implementa un programa que calcule la denominación ordinal de los reyes de
 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
 * van a introducir, y a continuación recibirá los nombres de los reyes.
 * Presentará por pantalla dichos nombres, pero colocándoles el ordinal
 * correspondiente. Así, por ejemplo, si hay dos Felipes en los nombres de los
 * reyes, el primero debería aparecer como Felipe 1º y el segundo como Felipe
 * 2º.
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Var declarations
        String[] kingsArray;
        String[] auxArray;
        int counter;
        int numKings;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Indica el número de reyes que vas a introducir: ");
        numKings = sc.nextInt();

        // Var init
        counter = 0;
        kingsArray = new String[numKings];
        auxArray = new String[numKings];

        // Input data
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        do {
            kingsArray[counter] = sc.next();
            auxArray[counter] = kingsArray[counter++];
        } while (counter < numKings);

        // Output data
        System.out.println("\nLos reyes introducidos son:");
        for (int i = 0; i < numKings; i++) {
            counter = 0;
            for (int j = 0; j <= i; j++) {
                if (kingsArray[i].equals(kingsArray[j]))
                    counter++;
            }
            System.out.println(kingsArray[i] + " " + counter + "º");
        }

        sc.close();
    }
}
