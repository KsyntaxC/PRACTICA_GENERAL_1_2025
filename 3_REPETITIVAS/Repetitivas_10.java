/*
 * Estamos en el año 3025, y el ajedrez ha evolucionado significativamente. Como parte de esta
 * nueva era, el Club de Ajedrez del Futuro te ha encargado la creacion de diversas tablas de
 * distintos tamaños.
 * Cada tabla tendra un tamaño de NxN y seguira un patron alternado de colores:
 * - El color negro estara representado por el numero 1
 * - El color blanco estara representado por el numero 0
 * La cuadricula siempre comenzara con negro (1) en la esquina superior izquierda y continuara
 * alternandose en toda la tabla.
 * ¡Manos a la obra!
 */
import java.util.Scanner;

public class Repetitivas_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
