/*
 * Sumatoria de tribonacci
 */
import java.util.Scanner;

public class Sumatorias_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Casos de prueba: ");
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.print("C: ");
            int C = sc.nextInt();
            
            int a = 0, b = -1, c = 1;
            int tribo = a + b + c;
            int s = 0;
            
            for (int j = 0; j < C; j++) {
                a = b;
                b = c;
                c = tribo;
                tribo = a + b + c;
                s += tribo;
            }
            
            System.out.println(s);
        }
    }
}