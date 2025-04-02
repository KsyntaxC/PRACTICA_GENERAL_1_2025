/*
 * Dado un lote, determinar el area de un triangulo por cada 3 numeros introducidos por teclado, cada 3 numeros simbolizan los 3 lados del tri´angulo.
 * Entrada: La primera linea contiene un numero n
 * Las siguientes n lineas contiene un unico entero x (1<=x<=10**2) por linea.
 * Salida: Para cada caso de prueba mostrar el area del triangulo. En caso de no haber
 * area imprimir ”No hay area”
 */
import java.util.Scanner;

public class Lotes_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        while (n < 1) {
            n = scanner.nextInt();
        }

        int a = 0, b = 0, c = 0, con = 1;
        
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            
            while (x < 1 || x > 100) {
                System.out.println("x (1 <= x <= 100)");
                x = scanner.nextInt();
            }

            a = b;
            b = c;
            c = x;
            con++;

            if (con > 3) {
                if (a + b > c && a + c > b && b + c > a) {
                    double s = (a + b + c) / 2.0;
                    double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    a = 0; b = 0; c = 0;
                    con = 1;
                    System.out.printf("Area: %.2f\n", A);
                } else {
                    a = 0; b = 0; c = 0;
                    con = 1;
                    System.out.println("No hay area");
                }
            }
        }

        scanner.close();
    }
}
