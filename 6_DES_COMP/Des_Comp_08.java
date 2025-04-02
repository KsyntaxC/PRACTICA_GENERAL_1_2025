/*
 * Dado un numero N imprimir algun otro que tenga n digitos, sea multiplo de 3 y sea minimo.
 */
import java.util.Scanner;

public class Des_Comp_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();
        
        int n = (int) Math.pow(10, N - 1);
        while (n % 3 != 0) {
            n++;
        }
        
        System.out.println(n);
        scanner.close();
    }
}
