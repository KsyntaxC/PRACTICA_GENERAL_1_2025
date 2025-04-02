/*
 * Se pide analizar la conjetura de collatz en un intervalo de valores, la conjetura es un problema
 * acerca de la teoria de numeros que establece que no importa el numero que se escoja siempre
 * se llegara al numero uno.
 * Se siguen los siguientes pasos si el numero es par se divide entre 2, y si el numero es impar
 * se multiplica por tres y se le suma 1.
 * Dado que se presupone que el numero llegara a ser 1 se pide que se cuantifique en cuantas
 * iteraciones se llega al 1. Pero se pide que dados un n ≥ 5 y m ≥ 5 se determine en el rango
 * [n, m] el numero que menos iteraciones le toma llegar al 1 y al que mas iteraciones le toma.
 * Ayuda: En el caso de empate de iteraciones se pide que se tome al numero mayor.
 * Salida: Se debe mostrar el numero que menos iteraciones le tomo llegar a 1 con el mensaje
 * ”menos iteraciones:” seguido de la cantidad de iteraciones. Hacer los mismo con el que mas
 * iteraciones le tomo llegar al 1.
 */
import java.util.Scanner;

public class Repetitivas_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        while (n < 5 || m < 5) {
            System.out.println("n y m deben ser mayores o iguales a 5");
            n = sc.nextInt();
            m = sc.nextInt();
        }

        int cn = 0;
        int cm = 0;
        int nn = n;
        int mm = m;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            cn++;
        }

        while (m != 1) {
            if (m % 2 == 0) {
                m = m / 2;
            } else {
                m = m * 3 + 1;
            }
            cm++;
        }

        if (cn < cm) {
            System.out.println(nn + " menos iteraciones: " + cn);
            System.out.println(mm + " mas iteraciones: " + cm);
        } else {
            System.out.println(mm + " menos iteraciones: " + cm);
            System.out.println(nn + " mas iteraciones: " + cn);
        }
        
        sc.close();
    }
}
