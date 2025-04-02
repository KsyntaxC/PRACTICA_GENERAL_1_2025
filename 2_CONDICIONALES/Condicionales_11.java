/*
 * Descripcion: Algunos operadores verifican la relacion entre dos valores y estos operadores
 * se denominan operadores relacionales. Dado dos valores numericos, su trabajo es solamente
 * determinar la relacion entre ellos:
 * El primero es mayor que el segundo. El primero es menor que el segundo. El primero y el
 * segundo son iguales.
 * Entrada: La primera linea del archivo de entrada es un numero entero t (t ¡15), que indica
 * cuantos pares de numeros se tiene en la entrada. Cada una de las siguientes t lineas, contiene
 * dos enteros a y b (—a—,—b—). La entrada termina cuando no hay mas datos
 * por leer.
 * Salida: Para cada linea de entrada se produce una linea de salida. Esta linea contiene
 * alguno de los siguientes operadores relacionales "<,>,=.”, el cual indica la relacion apropiada
 * entre los dos numeros.
 */
import java.util.Scanner;

public class Condicionales_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }

        sc.close();
    }
}
