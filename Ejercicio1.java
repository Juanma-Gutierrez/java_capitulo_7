/**
 * Exercise: 1
 *
 * @version: 29/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Var declarations
        int[] num = new int[12];

        // Var init
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        // Output data
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
