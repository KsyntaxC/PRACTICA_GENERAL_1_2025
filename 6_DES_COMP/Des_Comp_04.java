/*
 * Dado un numero n crear dos nuevos numeros, en el primero estaran digitos mayores que 5 y
 * en el segundo los menores o iguales 5.
 */
import java.util.Scanner;

public class Des_Comp_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        int M = 0, m = 0, poM = 1, pom = 1;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            if (d > 5) {
                M = d * poM + M;
                poM = poM * 10;
            } else {
                m = d * pom + m;
                pom = pom * 10;
            }
        }
        
        System.out.println("Mayores a 5: " + M);
        System.out.println("Menores o iguales a 5: " + m);
        
        scanner.close();
    }
}