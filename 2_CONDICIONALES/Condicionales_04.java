/*
 * Se pide diseñar el algoritmo para resolver una ecuacion de segundo grado, donde se pide que
 * primeramente se defina si las soluciones son complejas o reales. En el caso de que sean reales
 * mostrar la o las soluciones.
 * Entrada: La entrada consiste en los coeficientes a, b, c de una ecuacion cuadratica ax2+bx+c,
 * que pueden ser numeros negativos o positivos.
 */
import java.util.Scanner;

public class Condicionales_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        
        double D = b * b - 4 * a * c;
        
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Las soluciones son reales");
            System.out.printf("x1=%.3f   x2=%.3f\n", x1, x2);
        } else if (D == 0) {
            double x = -b / (2.0 * a);
            System.out.println("La solucion es real");
            System.out.printf("x=%.3f\n", x);
        } else {
            System.out.println("Las soluciones son imaginarias");
        }
        
        sc.close();
    }
}

