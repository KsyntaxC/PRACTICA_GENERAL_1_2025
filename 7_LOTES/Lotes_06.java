/*
 * Leer N numeros hasta que la suma de esos digitos sea multiplo de un numero X.
 */
import java.util.Scanner;

public class Lotes_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int sd = 0;
        
        while (N != 0) {
            int d = N % 10;
            N = N / 10;
            sd = sd + d;
        }
        
        while (sd % X != 0) {
            sd = 0;
            N = scanner.nextInt();
            
            while (N != 0) {
                int d = N % 10;
                N = N / 10;
                sd = sd + d;
            }
        }
        
        System.out.println(sd + " es multiplo de " + X);
        scanner.close();
    }
}
