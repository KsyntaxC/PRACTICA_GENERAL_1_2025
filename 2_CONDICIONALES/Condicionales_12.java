/*
 * Descripcion: En la planta nuclear Car se compro unas papas y quedaban 4, sin embargo Homero se comio una, Car es muy observador 
 * asi que vio que sus papas poian formar un rectangulo ahora homero debe romper un palo de papita en dos para que se forme un
 * rectangulo y asi Car no se de cuenta ayudalo a ver si es posible.
 * Hay tres palos con longitudes enteras x,y,z
 * Se le pide que rompa exactamente uno de ellos en dos pedazos de tal manera que:
 * -Todas las piezas tienen una longitud positiva mayor que 0 (longitud entera)
 * -La suma total de las 4 longitudes de las piezas es igual a la longitud original de x+y+z
 * -Es posible construir un rectangulo a partir de los cuatro palos resultantes, de modo que cada
 * palo se use exactamente como uno de sus lados recuerde tambien que un cuadrado tambien
 * se considera un rectangulo.
 * Determine si es posible hacer eso imprimiendo SI o NO dependiendo del caso.
 * Entrada: La entrada consiste en multiples casos de prueba. Cada caso de prueba contiene
 * 3 numeros 1¡=x,y,z¡=100 que representan las longitudes de los palitos. La entrada termina
 * cuando no hay mas datos por leer.
 * Salida: Por cada caso de prueba imprima SI o NO dependiendo de cual sea el caso
 */
import java.util.Scanner;

public class Condicionales_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x > y) {
                int temp = x; x = y; y = temp;
            }
            if (x > z) {
                int temp = x; x = z; z = temp;
            }
            if (y > z) {
                int temp = y; y = z; z = temp;
            }
            
            if ((x + y == z) || (x % 2 == 0 && x / 2 == y) || (y % 2 == 0 && y / 2 == x) || (z % 2 == 0 && z / 2 == x + y)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
