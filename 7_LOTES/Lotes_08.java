/*
 * Dado un lote de N numeros enteros Ai (1 ≤ i ≤ N ≤ 1000), donde 0 ≤ Ai ≤ 100000 contar
la cantidad de digitos 1, 3, 5, 7, 9 que existen.
Si N = 9 y los Ai = 12, 45, 981, 230190, 2, 45, 1354, 0, 54
Existen 4 uno s
Existen 2 tres s
Existen 4 cinco s
Existen 0 siete s
Existen 2 nueve s
 */
import java.util.Scanner;

public class Lotes_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        while (N < 1 || N > 1000) {
            System.out.println("(1 ≤ i ≤ N ≤ 1000)");
            N = scanner.nextInt();
        }
        
        int c1 = 0, c3 = 0, c5 = 0, c7 = 0, c9 = 0;
        
        for (int i = 1; i <= N; i++) {
            int A = scanner.nextInt();
            
            while (A < 0 || A > 100000) {
                System.out.println("A (0 ≤ Ai ≤ 100000)");
                A = scanner.nextInt();
            }
            
            while (A > 0) {
                int d = A % 10;
                A = A / 10;
                
                if (d == 1) {
                    c1++;
                } else if (d == 3) {
                    c3++;
                } else if (d == 5) {
                    c5++;
                } else if (d == 7) {
                    c7++;
                } else if (d == 9) {
                    c9++;
                }
            }
        }
        
        System.out.println("Existen " + c1 + " uno s");
        System.out.println("Existen " + c3 + " tres s");
        System.out.println("Existen " + c5 + " cinco s");
        System.out.println("Existen " + c7 + " siete s");
        System.out.println("Existen " + c9 + " nueve s");
        
        scanner.close();
    }
}
