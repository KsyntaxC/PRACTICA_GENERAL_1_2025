/*
 * Descripcion: En el reino de los Insanos Herland, Sami y Luisin estan jugando un juego, en cada ronda del juego cada uno de ellos grita un numero cualquiera, pero casualmente
 * dos de ellos siempre dicen el mismo numero (esto solo es posible en el reino de los Insanos).
 * Ahora tu trabajo es hacer un programa que imprima el nombre de la persona que dijo el
 * numero diferente.
 * Entrada: Se te dara un entero N que es el numero de rondas que se jugaran.Luego siguen N lineas, donde cada linea contiene 3 enteros separados por un espacio, a,b y c que
 * representan el numero que dijo Herland, Sami y Luisin respectivamente.
 * Salida: Por cada ronda del juego, debes imprimir el nombre de la persona que dijo el
 * numero diferente.
 */
import java.util.Scanner;

public class Condicionales_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.print("Herland, Sami, Luisin: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a == b && a != c) {
                System.out.println("Luisin");
            } else if (a == c && a != b) {
                System.out.println("Sami");
            } else if (b == c && b != a) {
                System.out.println("Herland");
            } else {
                System.out.println("Dos de ellos siempre dicen el mismo numero, PORQUE SON INSANOS");
            }
        }
        
        sc.close();
    }
}
