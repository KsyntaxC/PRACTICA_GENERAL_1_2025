/*
 * Descripcion: Generar la siguiente sumatoria para n terminos.
 * Entrada: La entrada consiste de T(1 ≤ T ≤ 100) casos de prueba, en cada caso de prueba
 * se te daran 2 numeros en una sola fila separados por un espacio, estos numeros enteros seran
 * n (1 ≤ n ≤ 120) y x (1 ≤ x ≤ 70) respectivamente. .
 * Salida: Por cada caso de prueba muestre el resultado de la sumatoria con 4 decimales
 * de precision.
 */
import java.util.Scanner;

public class Sumatorias_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            while (n < 1 || n > 120) {
                n = sc.nextInt();
            }
            
            int x = sc.nextInt();
            while (x < 1 || x > 70) {
                x = sc.nextInt();
            }
            
            int sig = 1;
            int primo = 2;
            int sw = 0;
            int nprimo = primo;
            int e = 1;
            int ce = 1;
            double s = 0;
            int a = -1;
            int b = 1;
            int fibo = a + b;
            
            for (int j = 0; j < n; j++) {
                sig *= -1;
                
                if (j % 2 == 0) {
                    while (sw == 0) {
                        int np = 1;
                        for (int k = 2; k < primo; k++) {
                            if (primo % k == 0) {
                                np = 0;
                            }
                        }
                        if (np == 1) {
                            nprimo = primo;
                            sw = 1;
                        }
                        primo++;
                    }
                    sw = 0;
                }
                
                if (ce > e) {
                    ce = 1;
                    e++;
                }
                ce++;
                
                a = b;
                b = fibo;
                fibo = a + b;
                
                System.out.printf("%d*(%d^%d / %d)%n", sig*nprimo, x, e, fibo);
                s += sig * nprimo * (Math.pow(x, e) / fibo);
            }
            
            System.out.println();
            System.out.printf("%.4f%n", s);
        }
    }
}