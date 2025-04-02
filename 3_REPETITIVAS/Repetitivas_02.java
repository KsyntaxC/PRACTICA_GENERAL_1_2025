/*
 * Diseñe un algoritmo que dado un numero N, halle la suma de los numeros pares e impares,
 * muestre por pantalla el resultado de ambas sumas.
 */
import java.util.Scanner;

public class Repetitivas_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int pa = 0, im = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                pa += i;
            } else {
                im += i;
            }
        }

        System.out.println("Pares: " + pa);
        System.out.println("Impares: " + im);
        
        sc.close();
    }
}
