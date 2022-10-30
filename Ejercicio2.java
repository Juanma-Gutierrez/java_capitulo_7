/**
 * Exercise: 2
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los
 * elementos que no han sido inicializados?
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        // Var declarations
        char[] charArray = new char[10];

        // Var init
        charArray[0] = 'a';
        charArray[1] = 'x';
        charArray[4] = '@';
        charArray[6] = ' ';
        charArray[7] = '+';
        charArray[8] = 'Q';

        // Output data
        for (char n : charArray)
            System.out.print(n + ",");

    }
}
