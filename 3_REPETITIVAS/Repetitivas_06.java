/*
 * Hallar el factorial de un numero N
 */
import java.util.Scanner;

public class Repetitivas_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        while (N < 0) {
            System.out.println("N no debe ser negativo");
            N = sc.nextInt();
        }

        if (N != 0) {
            int f = 1;
            for (int i = 1; i <= N; i++) {
                f = f * i;
            }
            System.out.println(N + "! = " + f);
        } else {
            System.out.println(N + "! = 1");
        }

        sc.close();
    }
}
