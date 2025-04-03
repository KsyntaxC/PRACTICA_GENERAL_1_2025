/*
 * Sumatoria para N terminos
 */
import java.util.Scanner;

public class Sumatorias_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("N: ");
            N = sc.nextInt();
            if (N < 1 || N > 100) System.out.println("1<=N<=100");
        } while (N < 1 || N > 100);

        int X;
        do {
            System.out.print("X: ");
            X = sc.nextInt();
            if (X < 1 || X > 10) System.out.println("1<=X<=10");
        } while (X < 1 || X > 10);

        for (int i = 0; i < N; i++) {
            int term = 2;
        }
    }
}