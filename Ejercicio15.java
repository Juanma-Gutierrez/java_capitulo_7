/**
 * Exercise: 15
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
 * como máximo e intente de nuevo”. Para el grupo que llega, se busca
 * siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
 * busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
 * dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
 * las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se
 * sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos
 * no se pueden romper aunque haya huecos sueltos suficientes. El
 * funcionamiento del programa se ilustra a continuación:
 */

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        // Var declarations
        int[] table;
        int clients;
        boolean available;

        // Var init
        table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = (int) (Math.random() * 5);
        }

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        do {
            do {
                // Print tables
                // Output data
                System.out.println(
                        "┌──────────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
                System.out.print("| Mesa nº: ");
                for (int i = 0; i < 10; i++) {
                    System.out.printf("│%2d ", (i + 1));
                }
                System.out.println(
                        "|\n├──────────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
                System.out.print("|          ");

                for (int t : table) {
                    System.out.printf("│ %1d ", t);
                }
                System.out.println(
                        "|\n└──────────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");

                // Input data
                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                clients = sc.nextInt();
                if (clients > 4 || clients < -1)
                    System.out.println("Por favor, introduzca una cantidad correcta de clientes (4 como máximo)\n\n");

                // Process
                available = false;
                for (int i = 0; i <= 4; i++) {
                    for (int j = 0; j < 10 && !available; j++)
                        if ((table[j] + clients <= 4) && (table[j] == i)) {
                            if (i == 0)
                                System.out.println("Por favor, siéntense en la mesa número " + j + "\n\n");
                            else
                                System.out.println(
                                        "Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + j
                                                + "\n\n");
                            table[j] += clients;
                            available = true;
                        }
                }
                if (!available)
                    System.out.println("Lo siento, en estos momentos no queda sitio." + "\n\n");
            } while (clients < -1 || clients > 4);

        } while (clients != -1);
        System.out.println("\n\nGracias. Hasta pronto.\n\n");
        sc.close();
    }

}
