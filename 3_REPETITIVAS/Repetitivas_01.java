/*
 * Descripcion: Dados numeros enteros a, b te piden hallar el maximo comun divisor entre a y b. 
 * Recordemos que el maximo comun divisor es el numero mas grande que divide a
 * ambos numeros. Por ejemplo: mcd(48, 60) es 12. Veamos que 48 es divisible por 2, 3, 4, 8, 6, 12
 * y el numero 60 es divisible por 2, 3, 4, 5, 6, 10, 12, 15, 20, 30. El numero mas grande que divide
 * a ambos es el 12, por esto decimos que mcd(48, 60) = 12.
 * Entrada: La primera linea contiene el numero n de casos de prueba. Luego sigue n lineas
 * cada una con un caso de prueba. Cada caso de prueba contiene dos numeros enteros a y b
 * separados por un espacio. 2 ≤ a, b ≤ 1000000
 * Salida: Escriba en una linea el maximo comun divisor entre a y b.
 */
import java.util.Scanner;

public class Repetitivas_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            while (a < 2 || a > 1000000 || b < 2 || b > 1000000) {
                System.out.println("Deben de ser numeros entre 2 y 1000000");
                a = sc.nextInt();
                b = sc.nextInt();
            }

            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }

            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }

            System.out.println(a);
        }
        
        sc.close();
    }
}
