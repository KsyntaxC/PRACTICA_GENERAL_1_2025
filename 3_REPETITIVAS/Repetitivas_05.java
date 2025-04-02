/*
 * Generar toda la tabla de multiplicar (del 1 al 10) dado un N.
 */
import java.util.Scanner;

public class Repetitivas_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int r = N * i;
            System.out.println(N + " x " + i + " = " + r);
        }

        sc.close();
    }
}
