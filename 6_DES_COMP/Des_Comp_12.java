/*
 * Dado un numero entero N averiguar la cantidad de digitos que tiene este
 * numero, y ademas determinar cual es su k -esimo digito.
 * Por ejemplo para N=18421 y k=3 , el numero tiene 5 digitos y el tercer digito es 4 .
 * Entrada: La entrada consta de dos numeros N (1 <=N <=1018 ), el numero a evaluar,
 * y K el digito que estamos interesados en conocer, se garantiza que K siempre sera menor o
 * igual al numero de digitos de N .
 * Salida: La salida consta de dos numeros separados por un espacio, la cantidad de digitos 
 * del numero N , y el k-esimo digito de este
 */
import java.util.Scanner;

public class Des_Comp_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        long N = scanner.nextLong();
        int cd = (int) Math.log10(N) + 1;
        int K = -1;
        int cdig = cd;

        System.out.print("k-esimo digito: ");
        int k = scanner.nextInt();

        for (int i = 1; i <= cd; i++) {
            int d = (int) (N / Math.pow(10, cd - 1));
            N = N % (long) Math.pow(10, cd - 1);
            cd = cd - 1;

            if (i == k) {
                K = d;
            }
        }

        System.out.println("Cantidad de dígitos: " + cdig);
        System.out.println("k-ésimo digito: " + K);

        scanner.close();
    }
}
