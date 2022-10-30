/**
 * Exercise: 8
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
 * un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Var declarations
        int[] tempArray;
        int max;
        int min;
        String character;
        String[] month;

        // Var init;
        tempArray = new int[12];
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
        month = new String[12];
        month[0] = "Enero";
        month[1] = "Febrero";
        month[2] = "Marzo";
        month[3] = "Abril";
        month[4] = "Mayo";
        month[5] = "Junio";
        month[6] = "Julio";
        month[7] = "Agosto";
        month[8] = "Septiembre";
        month[9] = "Octubre";
        month[10] = "Noviembre";
        month[11] = "Diciembre";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        for (int i = 0; i < 12; i++) {
            System.out.print("Introduce la temperatura media de " + month[i] + ": ");
            tempArray[i] = sc.nextInt();
            if (tempArray[i] > max)
                max = tempArray[i];
            if (tempArray[i] < min)
                min = tempArray[i];
        }
        System.out.print("¿Con qué carácter quieres representar la gráfica?: ");
        character = sc.next();

        // Output data
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-13s%4dº C ", month[i], tempArray[i]);
            for (int j = 0; j < tempArray[i]; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        sc.close();
    }
}
