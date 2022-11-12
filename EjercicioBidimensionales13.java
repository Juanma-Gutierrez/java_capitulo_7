/**
 * Exercise: Bidimensionales 13
 *
 * @version: 01/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que calcule la estatura media, mínima y máxima en
 * centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar
 * entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres
 * de los países se deben mostrar utilizando el array de países (no se pueden
 * escribir directamente).
 */

public class EjercicioBidimensionales13 {
    public static void main(String[] args) {
        // Var declarations
        String[] pais = { "España", "Rusia", "Japón", "Australia" };
        int[][] numArray;
        int total;
        int min;
        int max;

        // Var init
        numArray = new int[4][10];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 10; j++)
                numArray[i][j] = (int) (Math.random() * 71) + 140;

        // Process
        System.out.println(
                "                                                                         | MED | MIN | MAX |");
        for (int i = 0; i < 4; i++) {
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            total = 0;
            System.out.printf("%12s:", pais[i]);
            for (int j = 0; j < 10; j++) {
                System.out.printf("|%4d ", numArray[i][j]);
                if (numArray[i][j] > max)
                    max = numArray[i][j];
                if (numArray[i][j] < min)
                    min = numArray[i][j];
                total += numArray[i][j];
            }
            System.out.printf("|%4d |%4d |%4d |\n", ((int) total / 10), min, max);
        }
    }
}
