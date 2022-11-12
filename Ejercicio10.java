/**
 * Exercise: 10
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
 * que los almacene en un array. El programa debe ser capaz de pasar todos los
 * números pares a las primeras posiciones del array (del 0 en adelante) y todos
 * los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray;
        int[] evenArray;
        int[] oddArray;
        int counter;

        // Var init
        numArray = new int[20];
        evenArray = new int[20];
        oddArray = new int[20];
        for (int i = 0; i < 20; i++) {
            evenArray[i] = -1;
            oddArray[i] = -1;
        }
        counter = 0;

        // Generation data
        for (int i = 0; i < 20; i++)
            numArray[i] = (int) (Math.random() * 101);

        // Output data 1
        System.out.printf("%-30s", "Lista de número inicial:");
        for (int i = 0; i < numArray.length; i++)
            if (i == 0)
                System.out.print(numArray[i]);
            else
                System.out.print(", " + numArray[i]);
        System.out.println();

        // Process
        for (int i = 0; i < 20; i++)
            if (numArray[i] % 2 == 0)
                evenArray[i] = numArray[i];
            else
                oddArray[i] = numArray[i];

        while (counter < 20) {
            // Insert evens
            for (int i = 0; i < 20; i++)
                if (evenArray[i] >= 0) {
                    numArray[counter] = evenArray[i];
                    counter++;
                }

            // Insert odds
            for (int i = 0; i < 20; i++)
                if (oddArray[i] >= 0) {
                    numArray[counter] = oddArray[i];
                    counter++;
                }
        }

        // Output data 2
        System.out.printf("%-30s", "Lista de números procesada: ");
        for (int i = 0; i < numArray.length; i++)
            if (i == 0)
                System.out.print(numArray[i]);
            else
                System.out.print(", " + numArray[i]);
    }
}
