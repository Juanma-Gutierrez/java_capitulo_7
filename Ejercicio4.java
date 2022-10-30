/**
 * Exercise: 4
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Define tres arrays de 20 números enteros cada una, con nombres numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
 * En el array cuadrado se deben almacenar los cuadrados de los valores que hay
 * en el array numero. En el array cubo se deben almacenar los cubos de los
 * valores que hay en numero. A continuación, muestra el contenido de los tres
 * arrays dispuesto en tres columnas.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        // Var declarations
        int[] numero;
        int[] cuadrado;
        int[] cubo;

        // Var init;
        numero = new int[20];
        cuadrado = new int[20];
        cubo = new int[20];

        // Process
        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
        }

        // Output data
        for (int i = 0; i < 20; i++) {
            System.out.printf("%-25s%5d%10d%10d\n", "Posición " + i + " del array:", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
