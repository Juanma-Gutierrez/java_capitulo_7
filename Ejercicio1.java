/**
 * Exercise: 1
 *
 * @version: 29/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Define un array de 12 números enteros con nombre numArray y asigna los
 * valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Var declarations
        int[] numArray = new int[12];

        // Var init
        numArray[0] = 39;
        numArray[1] = -2;
        numArray[4] = 0;
        numArray[6] = 14;
        numArray[8] = 5;
        numArray[9] = 120;

        // Output data
        for (int n : numArray) {
            System.out.print(n + ",");
        }
    }
}
